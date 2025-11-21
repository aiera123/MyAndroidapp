package com.example.contacts;

import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState){
        TextView textView = findViewById(R.id.textView);
        Button sendReplyButton = findViewById(R.id.sendReplyButton);
        Intent intent = getIntent();
        if(intent ! = null && intent.hasExtra("email")){
            String email = intent.getStringExtra("email");
            textView.setText("Welcome: " +email);

        }
        sendReplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
                                               public void onClick(View v) {
                                                   String reply = replyEditText.getText().toString();
                                                   Intent resultIntent = new Intent();
                                                   resultIntent.putExtra("reply",reply);
                                                   setResult(SecondActivity.RESULT_OK, resultIntent);
                                                   finish();
                                               }
                                           }
        );

    }
    protected void onActivityResult(int requestCode, int reultCode, @Nullable Intent data)
}
