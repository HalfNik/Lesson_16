package com.example.lesson_16_hw.newsRecycleView

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.lesson_16_hw.R
import kotlinx.android.synthetic.main.news_adapter_element.view.*

class NewsAdapter : RecyclerView.Adapter<NewsAdapter.NewsViewHolder>() {

    var listOfNews = listOf<News>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        return NewsViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.news_adapter_element, parent, false))
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        //Почему пишем в контекс?
        Glide.with(holder.itemView.context)
            .load(listOfNews[position].newsPicture)
            .into(holder.itemView.ivNewsPicture)

        holder.itemView.ivNewsPicture
        holder.itemView.tvNewsDescription.text = listOfNews[position].newsDescription
    }

    override fun getItemCount(): Int {
        return listOfNews.size
    }

    //Что обозначает в скобках и знак ":"
    class NewsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}