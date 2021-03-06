package com.company.products;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.company.products.databinding.ActivityProductDetailBinding;

public class ProductDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detail);
        Book book = getIntent().getParcelableExtra("Book");
        ActivityProductDetailBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_product_detail);
        binding.setBook(book);
    }
}
