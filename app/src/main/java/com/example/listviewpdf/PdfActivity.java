package com.example.listviewpdf;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import static android.text.TextUtils.concat;

public class PdfActivity extends AppCompatActivity {

    PDFView myPDFViewer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf);

        // Instantiate the widgets
        myPDFViewer = (PDFView) findViewById(R.id.pdfViewer);

        // Receive the filename from MainActivity
        String getItem = getIntent().getStringExtra("pdfFileName");

        myPDFViewer.setBackgroundColor(getResources().getColor(R.color.dirty_white));

        // Getting PDF from Assets folder
        myPDFViewer.fromAsset(getItem.concat(".pdf"))
                .spacing(5)
                .load();

    }
}