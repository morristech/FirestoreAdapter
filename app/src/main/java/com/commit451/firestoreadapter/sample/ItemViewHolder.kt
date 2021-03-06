package com.commit451.firestoreadapter.sample

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    companion object {
        fun inflate(parent: ViewGroup): ItemViewHolder {
            return ItemViewHolder(LayoutInflater.from(parent.context)
                    .inflate(R.layout.item, parent, false))
        }
    }

    var textTitle: TextView = itemView.findViewById(R.id.text_title)
    var textSubtitle: TextView = itemView.findViewById(R.id.text_subtitle)
    var textOther: TextView = itemView.findViewById(R.id.text_other)
    var buttonDelete: View = itemView.findViewById(R.id.button_delete)
    var buttonUp: View = itemView.findViewById(R.id.button_up)

    fun bind(state: State) {
        textTitle.text = state.name
        textSubtitle.text = state.abbreviation
        textOther.text = state.population.toString()
    }
}