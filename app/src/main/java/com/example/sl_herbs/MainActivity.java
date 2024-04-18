package com.example.sl_herbs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button btn_addOne;

    List<herbs> herbsList= new ArrayList<herbs>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fillherblist();
        Log.d(TAG, "onCreate: ");

        fillherblist();
        btn_addOne = findViewById(R.id.btn_addOne);

        btn_addOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,AddEditOne.class);
                startActivity(intent);

            }
        });

    }

    private void fillherblist() {
        herbs h0 = new herbs( id:0, name: "curry leaf", scientificName: "Bergera Koenigii", description:"The curry tree or Bergera koenigii (syn. Murraya koenigii), is a tropical and sub-tropical tree in the family Rutaceae (the rue family, which includes rue, citrus, and satinwood), native to Asia.[4] The plant is also sometimes called sweet neem, though M. koenigii is in a different family to neem, Azadirachta indica, which is in the related family Meliaceae.\n" +
                "\n" +
                "Its leaves, known as curry leaves, also referred to as sweet neem, are used in many dishes in the Indian subcontinent." );
        herbs h1 = new herbs(id:1, name:" fennel",scientificName:"Foeniculum vulgare",description:"Fennel (Foeniculum vulgare) is a flowering plant species in the carrot family.[1][2] It is a hardy, perennial herb[3] with yellow flowers and feathery leaves.[4] It is indigenous to the shores of the Mediterranean but has become widely naturalized in many parts of the world, especially on dry soils near the sea coast and on riverbanks.\n" +
                "\n" +
                "It is a highly flavorful herb used in cooking and, along with the similar-tasting anise, is one of the primary ingredients of absinthe. Florence fennel or finocchio (UK: /fɪˈnɒkioʊ/, US: /-ˈnoʊk-/, Italian: [fiˈnɔkkjo]) is a selection with a swollen, bulb-like stem base that is used as a vegetable");
        herbs h2 = new herbs(id:2 ,name:"cinnamon",scientificName:"Cinnamomum verum",description:"Cinnamon is a spice obtained from the inner bark of several tree species from the genus Cinnamomum. Cinnamon is used mainly as an aromatic condiment and flavouring additive in a wide variety of cuisines, sweet and savoury dishes, breakfast cereals, snack foods, bagels, teas, hot chocolate and traditional foods. The aroma and flavour of cinnamon derive from its essential oil and principal component, cinnamaldehyde, as well as numerous other constituents including eugenol.");
        herbs h3 = new herbs(id:3,name:"cardamon",scientificName:"Elettaria cardamomum",description:"Elettaria cardamomum, commonly known as cardamom, is a pungent, aromatic, herbaceous, evergreen perennial of the ginger family. This plant is native to tropical areas of India, Burma and Sri Lanka.");

        herbsList.addAll(Arrays.asList(new herbs[]{h0,h1,h2,h3});

    }
}