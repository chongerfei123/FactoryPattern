package st.zlei.com.factorypattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import factory.ClothesAFactory;
import factory.ClothesALLFactory;
import factory.ClothesBFactory;
import factory.ClothesFactory;
import factory.ClothesFactory_reflect;
import product.Clothes;
import product.ClothesA;
import product.ClothesB;

public class MainActivity extends AppCompatActivity {

    private Button a_button;
    private Button b_button;
    private Button a_reflect_button;
    private Button b_reflect_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a_button = (Button) findViewById(R.id.a_button);
        b_button = (Button) findViewById(R.id.b_button);
        a_reflect_button = (Button) findViewById(R.id.a_reflect_button);
        b_reflect_button = (Button) findViewById(R.id.b_reflect_button);


        a_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClothesFactory factory = new ClothesAFactory();
                Clothes clothes = factory.createClothes();
                clothes.method(getApplicationContext());
            }
        });

        b_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClothesFactory factory = new ClothesBFactory();
                Clothes clothes = factory.createClothes();
                clothes.method(getApplicationContext());
            }
        });

        a_reflect_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClothesFactory_reflect clothesFactory_reflect = new ClothesALLFactory();
                try {
                    //生产A产品就传入ClothesA.class
                    ClothesA clothes = clothesFactory_reflect.createClothes(ClothesA.class);
                    clothes.method(getApplicationContext());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        b_reflect_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClothesFactory_reflect clothesFactory_reflect = new ClothesALLFactory();
                try {
                    //生产A产品就传入ClothesB.class
                    ClothesB clothes = clothesFactory_reflect.createClothes(ClothesB.class);
                    clothes.method(getApplicationContext());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
