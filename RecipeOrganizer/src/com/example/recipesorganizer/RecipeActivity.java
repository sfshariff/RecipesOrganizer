package com.example.recipesorganizer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.TextView;

public class RecipeActivity extends Activity {

	@Override
	public void onCreate(Bundle bundle) {
		super.onCreate(bundle);
		setContentView(R.layout.recipe);

	
		
		//String recipeName = "Elbows and Ground Beef";
		
		

		TextView textView = (TextView)findViewById(R.id.recipe_name);
		TextView textView_ingredients = (TextView)findViewById(R.id.recipe_ingredients);
		TextView textView_method = (TextView)findViewById(R.id.recipe_method);
		
		
		String ingredients = "#8226 1 1/2 pounds lean ground beef \n" +
				"#8226 1 green bell pepper, chopped \n" +
				"#8226 1 onion, chopped \n" +
				"#8226 2 (29 ounce) cans tomato sauce \n" +
				"#8226 1 (16 ounce) package macaroni \n";
		
		textView_ingredients.setText(ingredients);
		
		String method = "1. Cook pasta according to package directions. Drain. \n" +
				"2. In a Dutch oven, brown ground beef over medium heat. Add chopped onion, and cook until onion is soft. Add green pepper and tomato sauce; cook until pepper is soft. \n" +
				"3. Serve sauce over pasta.";
		
		textView_method.setText(method);
		//textView.setText(recipeName);

			
		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
	    // Inflate the menu items for use in the action bar
	    MenuInflater inflater = getMenuInflater();
	    inflater.inflate(R.menu.recipecontent, menu);
	    return super.onCreateOptionsMenu(menu);
	}
}
