package com.Drjaickal.notekeeper.Listeners;

import androidx.cardview.widget.CardView;

import com.Drjaickal.notekeeper.Models.Notes;

public interface NoteClickListener {
    void onClick(Notes notes);
    void onLongClick(Notes notes, CardView cardView);
}
