package com.example.lesson_16_hw

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.lesson_16_hw.newsRecycleView.News
import com.example.lesson_16_hw.newsRecycleView.NewsAdapter
import kotlinx.android.synthetic.main.fragment_list.*

class ListFragment : Fragment() {

    private var adapter : NewsAdapter? = null
    private val listOfNews = listOf (News
        (newsPicture = "https://media1.giphy.com/media/5ZYBuyZC9uubrIIYXf/" +
            "giphy.gif?cid=790b7611363bb2bed0a9dbeddc93446da12c4f75f64ea121&rid=giphy.gif&ct=g",
        newsDescription = "Journalism is not only to inform but to enlighten. " +
                "To rise above fear and to probe. To give voice to the voiceless and hold those " +
                "in power accountable. Journalism is to be accessible to all."))

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        setNewsAdapter()

    }

    private fun setNewsAdapter() {
        adapter = NewsAdapter()
        adapter?.listOfNews = listOfNews
        rvNews.adapter = adapter
        rvNews.layoutManager = LinearLayoutManager(requireContext())
    }
}