/*

 */
package calculator;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.geometry.Insets;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author Edwin Gomez - COM 370 RPN Calculator
 * You can type a number, click enter, and x will be assigned that number.
 * Then you can type in another number, click enter, and y will be assigned x, 
 * and x will be assigned the number you entered. Then just click on an operation
 * and the calculator will do y-x, or y*x, or y/x, or y+x and it'll enter into x. 
 * If you want to do sin, cos, tan, sqrt, exp, or log then type a number and 
 * hit enter so it goes into x. Then click any one of those functions and the 
 * result will be in x. If you want to enter 0, then click zero and click enter. 
 * Also, the parenthesis don't work. Originally I was going to make this much more
 * complex, but I decided against it and made it more RPN-ish. So completely 
 * disregard the parenthesis. 
 */
public class Calculator extends Application {
    
    String displaystr = "";
    double x=0;
    double y=0;
    double z=0;
    double t=0;
    @Override
    public void start(Stage primaryStage) {
        
        //Creating the labels and text that will show the results of operations
        //or just display the numbers a user enters into the calculator
        Label xlbl = new Label("X:");
        Label ylbl = new Label("Y:");
        Label xtext = new Label();
        Label ytext = new Label();
        Label nothinglbl = new Label("        ");
        xtext.setText(String.valueOf(x));
        ytext.setText(String.valueOf(y));
        
        
        TextField display = new TextField("");
        
        
        //Everything from here to line 380-ish is just making each button, and 
        //the method for what each button does. 
        Button btn0 = new Button("0");
        btn0.setPrefWidth(45);
        btn0.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("0");
                displaystr+="0";
                display.setText(displaystr);
            }
        });
        
        Button btn1 = new Button("1");
        btn1.setPrefWidth(45);
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("1");
                displaystr+="1";
                display.setText(displaystr);
            }
        });
        
        Button btn2 = new Button("2");
        btn2.setPrefWidth(45);
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("2");
                displaystr+="2";
                display.setText(displaystr);
            }
        });
        
        Button btn3 = new Button("3");
        btn3.setPrefWidth(45);
        btn3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("3");
                displaystr+="3";
                display.setText(displaystr);
            }
        });
        
        Button btn4 = new Button("4");
        btn4.setPrefWidth(45);
        btn4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("4");
                displaystr+="4";
                display.setText(displaystr);
            }
        });
        
        Button btn5 = new Button("5");
        btn5.setPrefWidth(45);
        btn5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("5");
                displaystr+="5";
                display.setText(displaystr);
            }
        });
        
        Button btn6 = new Button("6");
        btn6.setPrefWidth(45);
        btn6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("6");
                displaystr+="6";
                display.setText(displaystr);
            }
        });
        
        Button btn7 = new Button("7");
        btn7.setPrefWidth(45);
        btn7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("7");
                displaystr+="7";
                display.setText(displaystr);
            }
        });
        
        Button btn8 = new Button("8");
        btn8.setPrefWidth(45);
        btn8.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("8");
                displaystr+="8";
                display.setText(displaystr);
            }
        });
        
        Button btn9 = new Button("9");
        btn9.setPrefWidth(45);
        btn9.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("9");
                displaystr+="9";
                display.setText(displaystr);
            }
        });
        
        Button pibtn = new Button("pi");
        pibtn.setPrefWidth(60);
        pibtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("pi");
                displaystr+=Math.PI;
                display.setText(displaystr);
            }
        });
        
        Button decbtn = new Button(".");
        decbtn.setPrefWidth(45);
        decbtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println(".");
                if (displaystr.contains(".")){
                    
                } else {
                    displaystr+=".";
                    display.setText(displaystr);
                }
            }
        });
        
        Button leftbtn = new Button("(");
        leftbtn.setPrefWidth(45);
        leftbtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("(");
                displaystr+="(";
                display.setText(displaystr);
            }
        });
        
        Button rightbtn = new Button(")");
        rightbtn.setPrefWidth(45);
        rightbtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println(")");
                displaystr+=")";
                display.setText(displaystr);
            }
        });
        
        Button addbtn = new Button("+");
        addbtn.setPrefWidth(45);
        addbtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("+");
                x=x+y;
                y=0;
                displaystr="";
                display.setText(displaystr);
                xtext.setText(String.valueOf(x));
                ytext.setText(String.valueOf(y));
            }
        });
        
        Button subbtn = new Button("-");
        subbtn.setPrefWidth(45);
        subbtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("-");
                x=y-x;
                y=0;
                displaystr="";
                display.setText(displaystr);
                xtext.setText(String.valueOf(x));
                ytext.setText(String.valueOf(y));
            }
        });
        
        Button multbtn = new Button("x");
        multbtn.setPrefWidth(45);
        multbtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("*");
                x=y*x;
                y=0;
                displaystr="";
                display.setText(displaystr);
                xtext.setText(String.valueOf(x));
                ytext.setText(String.valueOf(y));
            }
        });
        
        Button divbtn = new Button("÷");
        divbtn.setPrefWidth(45);
        divbtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("÷");
                x=y/x;
                y=0;
                displaystr="";
                display.setText(displaystr);
                xtext.setText(String.valueOf(x));
                ytext.setText(String.valueOf(y));
            }
        });
        
        Button enterbtn = new Button("Ent");
        enterbtn.setPrefWidth(45);
        enterbtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                y=x;
                x=Double.parseDouble(displaystr);
                xtext.setText(String.valueOf(x));
                ytext.setText(String.valueOf(y));
                System.out.println("Entered");
                displaystr="";
            }
        });
        
        Button sinbtn = new Button("Sin()");
        sinbtn.setPrefWidth(60);
        sinbtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Sin()");
                x=Math.sin(x);
                displaystr="";
                display.setText(displaystr);
                xtext.setText(String.valueOf(x));
                ytext.setText(String.valueOf(y));
            }
        });
        
        Button cosbtn = new Button("Cos()");
        cosbtn.setPrefWidth(60);
        cosbtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Cos()");
                x=Math.cos(x);
                displaystr="";
                display.setText(displaystr);
                xtext.setText(String.valueOf(x));
                ytext.setText(String.valueOf(y));
            }
        });
        
        Button tanbtn = new Button("Tan()");
        tanbtn.setPrefWidth(60);
        tanbtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Tan()");
                x=Math.tan(x);
                displaystr="";
                display.setText(displaystr);
                xtext.setText(String.valueOf(x));
                ytext.setText(String.valueOf(y));
            }
        });
        
        Button sqrtbtn = new Button("√x");
        sqrtbtn.setPrefWidth(45);
        sqrtbtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("√x");
                x=Math.sqrt(x);
                displaystr="";
                display.setText(displaystr);
                xtext.setText(String.valueOf(x));
                ytext.setText(String.valueOf(y));
            }
        });
        
        Button expbtn = new Button("exp");
        expbtn.setPrefWidth(45);
        expbtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("**");
                x=Math.pow(y,x);
                y=0;
                displaystr="";
                display.setText(displaystr);
                xtext.setText(String.valueOf(x));
                ytext.setText(String.valueOf(y));
            }
        });
        
        Button logbtn = new Button("Log");
        logbtn.setPrefWidth(60);
        logbtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Log");
                x=Math.log10(x);
                displaystr="";
                display.setText(displaystr);
                xtext.setText(String.valueOf(x));
                ytext.setText(String.valueOf(y));
            }
        });
        
        Button clrbtn = new Button("Clr");
        clrbtn.setPrefWidth(45);
        clrbtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("clear");
                displaystr="";
                display.setText(displaystr);
            }
        });
        
        Button CHSbtn = new Button("+/-");
        CHSbtn.setPrefWidth(45);
        CHSbtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("+/-");
                if(displaystr.contains("-")){
                    displaystr = displaystr.substring(1);
                    display.setText(displaystr);
                } else {
                    displaystr = new StringBuilder(displaystr).insert(0, "-").toString();
                    display.setText(displaystr);
                }
            }
        });
        
        // Create a Grid pane
        GridPane root = new GridPane();
        
        //Adding all the objects to the Grid
        root.add(display,0,0,5,1);
        display.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        root.add(logbtn,0,1);
        root.add(sqrtbtn,1,1);
        root.add(expbtn,2,1);;
        root.add(leftbtn,3,1);
        root.add(rightbtn,4,1);
        root.add(pibtn,0,2);
        root.add(btn7,1,2);
        root.add(btn8,2,2);
        root.add(btn9,3,2);
        root.add(divbtn,4,2);
        root.add(sinbtn,0,3);
        root.add(btn4,1,3);
        root.add(btn5,2,3);
        root.add(btn6,3,3);
        root.add(multbtn,4,3);
        root.add(cosbtn,0,4);
        root.add(btn1,1,4);
        root.add(btn2,2,4);
        root.add(btn3,3,4);
        root.add(subbtn,4,4);
        root.add(tanbtn,0,5);
        root.add(btn0,1,5);
        root.add(decbtn,2,5);
        root.add(CHSbtn,3,5);
        root.add(addbtn,4,5);
        root.add(enterbtn,5,3,1,3);// node, columnIndex, rowIndex, columnSpan, rowSpan
        enterbtn.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        root.add(clrbtn,5,1,1,2);// node, columnIndex, rowIndex, columnSpan, rowSpan
        clrbtn.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        root.add(nothinglbl,6,0);
        root.add(xlbl,7,0);
        root.add(ylbl,7,1);
        root.add(xtext,8,0);
        root.add(ytext,8,1);
   
        
        Scene scene = new Scene(root, 500, 550);
        
        primaryStage.setTitle("RPN Calculator - Edwin Gomez - COM-370");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
