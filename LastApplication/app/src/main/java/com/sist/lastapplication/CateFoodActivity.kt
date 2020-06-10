package com.sist.lastapplication

import android.content.Intent
import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.AdapterView
import android.widget.ListView
import android.widget.TextView
import org.json.JSONObject
import java.net.URL

class CateFoodActivity : AppCompatActivity() {
    var dataList = ArrayList<HashMap<String,String>>();
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_cate_food)
        val title = intent.getStringExtra("title")
        val subject = intent.getStringExtra("subject")
        val titleTextView= findViewById<TextView>(R.id.cate_titleView)
        titleTextView.text= title
        val sujectTextView = findViewById<TextView>(R.id.subjectText)
        sujectTextView.text = subject


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        fetchJsonData().execute()

        val homeListView = findViewById<ListView>(R.id.HomeListView)
        homeListView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
//            Toast.makeText(this,"선택번호:$cateno",Toast.LENGTH_LONG).show()
//            var cateno=findViewById<TextView>(R.id.catenoTextVeiw).text
//            var titile = findViewById<TextView>(R.id.titleView).text
//            var subject = findViewById<TextView>(R.id.subjectText).text
            var cateno = dataList.get(position).get("no")
            var title = dataList.get(position).get("title")
            var price = dataList.get(position).get("price")

            val intent = Intent(this, CateFoodActivity::class.java)
            intent.putExtra("no",cateno.toString())
            intent.putExtra("title",title.toString())
            intent.putExtra("price",title.toString())
            //화면 이동
            startActivity(intent)
        }
    }
    inner class fetchJsonData() : AsyncTask<String, Void, String>() {
        override fun onPreExecute() {
            super.onPreExecute()
        }

        override fun doInBackground(vararg params: String?): String? {
            return URL("http://211.238.142.211:2233/store").readText(
                Charsets.UTF_8
            )
        }
        override fun onPostExecute(result: String?) {
            super.onPostExecute(result)

            val jsonObj = JSONObject(result)
            val usersArr = jsonObj.getJSONArray("store")
            for (i in 0 until usersArr.length()) {
                val singleUser = usersArr.getJSONObject(i)
                val map = HashMap<String, String>()
                map["no"] = singleUser.getString("no")
                map["store"] = singleUser.getString("store")
                map["title"] = singleUser.getString("title")
                map["brand"] = singleUser.getString("brand")
                map["price"] = singleUser.getString("price")
                map["image"] = singleUser.getString("image")

                dataList.add(map)
            }
            val CateListView =findViewById<ListView>(R.id.cateListView)
            CateListView.adapter =
                HomeAdapter(this@CateFoodActivity, dataList)
        }
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu,menu);
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item?.itemId){
            R.id.home_menu->{
                // 화면 이동 -> Home으로 이동해라
                var intent= Intent(this,HomeActivity::class.java)
                startActivity(intent)
                return true;
            }
            R.id.home_pop->{
                var intent= Intent(this,PopActivity::class.java)
                startActivity(intent)
                return true;
            }
            R.id.home_recommand->{
                var intent= Intent(this,RecommandActivity::class.java)
                startActivity(intent)
                return true;
            }
            R.id.home_recipe->{
                var intent= Intent(this,RecipeActivity::class.java)
                startActivity(intent)
                return true;
            }
            R.id.home_news->{
                var intent= Intent(this,NewsActivity::class.java)
                startActivity(intent)
                return true;
            }
        }
        return super.onOptionsItemSelected(item)
    }
}