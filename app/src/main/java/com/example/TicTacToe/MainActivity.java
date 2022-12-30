package com.example.TicTacToe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, result, cross, circle;
    Button reset;
    String text = "";
    int count = 0;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        first = findViewById(R.id.first);
        second = findViewById(R.id.second);
        third = findViewById(R.id.third);
        fourth = findViewById(R.id.fourth);
        fifth = findViewById(R.id.fifth);
        sixth = findViewById(R.id.sixth);
        seventh = findViewById(R.id.seventh);
        eighth = findViewById(R.id.eighth);
        ninth = findViewById(R.id.ninth);

        result = findViewById(R.id.result);

        cross = findViewById(R.id.cross);
        circle = findViewById(R.id.circle);

        reset = findViewById(R.id.reset);

//        choosing for X or O to start the game
        cross.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                if (count == 1) {
                    text = cross.getText().toString();
                    Toast.makeText(MainActivity.this, "X is selected.", Toast.LENGTH_SHORT).show();
                }
            }
        });
        circle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                if (count == 1) {
                    text = circle.getText().toString();
                    Toast.makeText(MainActivity.this, "O is selected.", Toast.LENGTH_SHORT).show();
                }
            }
        });

//        setting text
        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (text.equals("")) {
                    if (result.getText().toString().equals("")) {
                        Toast.makeText(MainActivity.this, "select between X or O", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(MainActivity.this, "REMATCH!!", Toast.LENGTH_SHORT).show();
                    }
                } else if (first.getText().toString().equals("X") || first.getText().toString().equals("O")) {
                    Toast.makeText(MainActivity.this, "Ocuupied", Toast.LENGTH_SHORT).show();
                } else {
                    first.setText(text);
                    if (text.equals("X")) {
                        text = "O";
                    } else {
                        text = "X";
                    }
                }
                strCheck(first);
            }
        });
        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (text.equals("")) {
                    if (result.getText().toString().equals("")) {
                        Toast.makeText(MainActivity.this, "select between X or O", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(MainActivity.this, "REMATCH!!", Toast.LENGTH_SHORT).show();
                    }
                } else if (second.getText().toString().equals("X") || second.getText().toString().equals("O")) {
                    Toast.makeText(MainActivity.this, "Ocuupied", Toast.LENGTH_SHORT).show();
                } else {
                    second.setText(text);
                    if (text.equals("X")) {
                        text = "O";
                    } else {
                        text = "X";
                    }
                }
                strCheck(second);
            }
        });
        third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (text.equals("")) {
                    if (result.getText().toString().equals("")) {
                        Toast.makeText(MainActivity.this, "select between X or O", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(MainActivity.this, "REMATCH!!", Toast.LENGTH_SHORT).show();
                    }
                } else if (third.getText().toString().equals("X") || third.getText().toString().equals("O")) {
                    Toast.makeText(MainActivity.this, "Ocuupied", Toast.LENGTH_SHORT).show();
                } else {
                    third.setText(text);
                    if (text.equals("X")) {
                        text = "O";
                    } else {
                        text = "X";
                    }
                }
                strCheck(third);
            }
        });
        fourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (text.equals("")) {
                    if (result.getText().toString().equals("")) {
                        Toast.makeText(MainActivity.this, "select between X or O", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(MainActivity.this, "REMATCH!!", Toast.LENGTH_SHORT).show();
                    }
                } else if (fourth.getText().toString().equals("X") || fourth.getText().toString().equals("O")) {
                    Toast.makeText(MainActivity.this, "Ocuupied", Toast.LENGTH_SHORT).show();
                } else {
                    fourth.setText(text);
                    if (text.equals("X")) {
                        text = "O";
                    } else {
                        text = "X";
                    }
                }
                strCheck(fourth);
            }
        });
        fifth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (text.equals("")) {
                    if (result.getText().toString().equals("")) {
                        Toast.makeText(MainActivity.this, "select between X or O", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(MainActivity.this, "REMATCH!!", Toast.LENGTH_SHORT).show();
                    }
                } else if (fifth.getText().toString().equals("X") || fifth.getText().toString().equals("O")) {
                    Toast.makeText(MainActivity.this, "Ocuupied", Toast.LENGTH_SHORT).show();
                } else {
                    fifth.setText(text);
                    if (text.equals("X")) {
                        text = "O";
                    } else {
                        text = "X";
                    }
                }
                strCheck(fifth);
            }
        });
        sixth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (text.equals("")) {
                    if (result.getText().toString().equals("")) {
                        Toast.makeText(MainActivity.this, "select between X or O", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(MainActivity.this, "REMATCH!!", Toast.LENGTH_SHORT).show();
                    }
                } else if (sixth.getText().toString().equals("X") || sixth.getText().toString().equals("O")) {
                    Toast.makeText(MainActivity.this, "Ocuupied", Toast.LENGTH_SHORT).show();
                } else {
                    sixth.setText(text);
                    if (text.equals("X")) {
                        text = "O";
                    } else {
                        text = "X";
                    }
                }
                strCheck(sixth);
            }
        });
        seventh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (text.equals("")) {
                    if (result.getText().toString().equals("")) {
                        Toast.makeText(MainActivity.this, "select between X or O", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(MainActivity.this, "REMATCH!!", Toast.LENGTH_SHORT).show();
                    }
                } else if (seventh.getText().toString().equals("X") || seventh.getText().toString().equals("O")) {
                    Toast.makeText(MainActivity.this, "Ocuupied", Toast.LENGTH_SHORT).show();
                } else {
                    seventh.setText(text);
                    if (text.equals("X")) {
                        text = "O";
                    } else {
                        text = "X";
                    }
                }
                strCheck(seventh);
            }
        });
        eighth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (text.equals("")) {
                    if (result.getText().toString().equals("")) {
                        Toast.makeText(MainActivity.this, "select between X or O", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(MainActivity.this, "REMATCH!!", Toast.LENGTH_SHORT).show();
                    }
                } else if (eighth.getText().toString().equals("X") || eighth.getText().toString().equals("O")) {
                    Toast.makeText(MainActivity.this, "Ocuupied", Toast.LENGTH_SHORT).show();
                } else {
                    eighth.setText(text);
                    if (text.equals("X")) {
                        text = "O";
                    } else {
                        text = "X";
                    }
                }
                strCheck(eighth);
            }
        });
        ninth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (text.equals("")) {
                    if (result.getText().toString().equals("")) {
                        Toast.makeText(MainActivity.this, "select between X or O", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(MainActivity.this, "REMATCH!!", Toast.LENGTH_SHORT).show();
                    }
                } else if (ninth.getText().toString().equals("X") || ninth.getText().toString().equals("O")) {
                    Toast.makeText(MainActivity.this, "Ocuupied", Toast.LENGTH_SHORT).show();
                } else {
                    ninth.setText(text);
                    if (text.equals("X")) {
                        text = "O";
                    } else {
                        text = "X";
                    }
                }
                strCheck(ninth);
            }
        });

//        click on RESET button
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = "";
                count = 0;
                clearText(first);
                clearText(second);
                clearText(third);
                clearText(fourth);
                clearText(fifth);
                clearText(sixth);
                clearText(seventh);
                clearText(eighth);
                clearText(ninth);
                clearText(result);
            }
        });
    }

    //    after RESET button triggered clearing all TEXTVIEW text and making the text String empty
    public void clearText(TextView v) {
        v.setText("");
    }

    //    RESULT function
    public void printResult(TextView v) {
        if (v.getText().equals("")) {
            result.setText("");
        } else {
            result.setText(v.getText().toString() + " WON!!");
            text = "";

        }
    }

    //    checking for WIN possibility
    public void strCheck(TextView v) {
        //        checking rows
        if (first.getText().toString().equals(second.getText().toString()) && first.getText().toString().equals(third.getText().toString())) {
            printResult(first);
        } else if (fourth.getText().toString().equals(fifth.getText().toString()) && fifth.getText().toString().equals(sixth.getText().toString())) {
            printResult(fourth);
        } else if (seventh.getText().toString().equals(eighth.getText().toString()) && eighth.getText().toString().equals(ninth.getText().toString())) {
            printResult(seventh);
        }

//        checking columns
        else if (first.getText().toString().equals(fourth.getText().toString()) && fourth.getText().toString().equals(seventh.getText().toString())) {
            printResult(first);
        } else if (second.getText().toString().equals(fifth.getText().toString()) && fifth.getText().toString().equals(eighth.getText().toString())) {
            printResult(second);
        } else if (third.getText().toString().equals(sixth.getText().toString()) && sixth.getText().toString().equals(ninth.getText().toString())) {
            printResult(third);
        }

//        checking diagonals
        else if (first.getText().toString().equals(fifth.getText().toString()) && fifth.getText().toString().equals(ninth.getText().toString())) {
            printResult(first);
        } else if (third.getText().toString().equals(fifth.getText().toString()) && fifth.getText().toString().equals(seventh.getText().toString())) {
            printResult(third);
        }

//        making match draw
        else if (!first.getText().toString().equals("") && !second.getText().toString().equals("") && !third.getText().toString().equals("") && !fourth.getText().toString().equals("") && !fifth.getText().toString().equals("") && !sixth.getText().toString().equals("") && !seventh.getText().toString().equals("") && !eighth.getText().toString().equals("") && !ninth.getText().toString().equals("")) {
            result.setText("Match DRAW!!");
            text = "";
        }
    }

}
