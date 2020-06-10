package com.sist.lastapplication

import android.content.Intent
import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.AdapterView
import android.widget.ListView
import kotlinx.android.synthetic.main.activity_news.*
import org.json.JSONObject
import java.net.URL

class NewsActivity : AppCompatActivity() {
        var dataList = ArrayList<HashMap<String,String>>();
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_news)
            fetchJsonData().execute("맛집")

            news_Btn.setOnClickListener {
                val fd = new_eidtView.text
                dataList.clear()
                fetchJsonData().execute(fd.toString())
            }
            NewsListView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
                var link = dataList.get(position).get("link")
                val intent = Intent(this, NewsDetailActivity::class.java)

                intent.putExtra("link",link.toString())
                //화면 이동
                startActivity(intent)
            }
        }
        // 데이터 읽기
        inner class fetchJsonData() : AsyncTask<String, Void, String>() {
            override fun onPreExecute() {
                super.onPreExecute()
            }
            // String ...
            // excute("","","") vararg params : String?  ?: 값을 여러 개 받을 수 있음
            override fun doInBackground(vararg params: String?): String? {
                return URL("http://211.238.142.211:2233/news2?fd="+params[0]).readText(
                    Charsets.UTF_8
                )
            }
            override fun onPostExecute(result: String?) {
                super.onPostExecute(result)
                val jsonObj = JSONObject(result)
                val usersArr = jsonObj.getJSONArray("news")
                for (i in 0 until usersArr.length()) {
                    val singleUser = usersArr.getJSONObject(i)
                    val map = HashMap<String, String>()
                    map["content"] = singleUser.getString("description")
                    map["brand"] = singleUser.getString("brand")
                    map["image"] = singleUser.getString("image")
                    map["link"] = singleUser.getString("link")

                    dataList.add(map)
                }
               val NewsListView = findViewById<ListView>(R.id.NewsListView)
                NewsListView.adapter = NewsAdapter(this@NewsActivity, dataList)
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
                var intent=Intent(this,HomeActivity::class.java)
                startActivity(intent)
                return true;
            }
            R.id.home_pop->{
                var intent=Intent(this,PopActivity::class.java)
                startActivity(intent)
                return true;
            }
            R.id.home_recommand->{
                var intent=Intent(this,RecommandActivity::class.java)
                startActivity(intent)
                return true;
            }
            R.id.home_recipe->{
                var intent=Intent(this,RecipeActivity::class.java)
                startActivity(intent)
                return true;
            }
            R.id.home_news->{
                var intent=Intent(this,NewsActivity::class.java)
                startActivity(intent)
                return true;
            }
        }
        return super.onOptionsItemSelected(item)
    }
}