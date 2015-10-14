package calcularor.tensed;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import android.R.integer;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class CalCulatorActivity extends Activity implements OnClickListener{
    /** Called when the activity is first created. */
	boolean add=false,mul=false,sub=false,div=false,eq=true;
	boolean check=true;
	String history="";
	String record[];
	int inc=0;
	float value1=-1,value2=-1,result=0;
     SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Calendar cal=Calendar.getInstance();
     
	private SharedPreferences myPreferance;
	float  save;
	private String name="Data"; 
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
       
       
        Button one = (Button) findViewById(R.id.button1);
        one.setOnClickListener(this); // calling onClick() method
        Button two = (Button) findViewById(R.id.button2);
        two.setOnClickListener(this);
        Button three = (Button) findViewById(R.id.button3);
        three.setOnClickListener(this);
        Button four = (Button) findViewById(R.id.button4);
        four.setOnClickListener(this); // calling onClick() method
        
        Button four1 = (Button) findViewById(R.id.button5);
        four1.setOnClickListener(this); // calling onClick() method 
        
        Button five = (Button) findViewById(R.id.button6);
        five.setOnClickListener(this);
        Button six = (Button) findViewById(R.id.button7);
        six.setOnClickListener(this);
        Button seven = (Button) findViewById(R.id.button9);
        seven.setOnClickListener(this); // calling onClick() method
        Button eight = (Button) findViewById(R.id.button10);
        eight.setOnClickListener(this);
        Button nine = (Button) findViewById(R.id.button11);
        nine.setOnClickListener(this);
        
        Button add = (Button) findViewById(R.id.button4);
        add.setOnClickListener(this); // calling onClick() method
        Button sub = (Button) findViewById(R.id.button8);
        sub.setOnClickListener(this);
        Button mul = (Button) findViewById(R.id.button12);
        mul.setOnClickListener(this);
        
        
        Button zero = (Button) findViewById(R.id.button13);
        zero.setOnClickListener(this); // calling onClick() method
        Button dec = (Button) findViewById(R.id.button14);
        dec.setOnClickListener(this);
        Button equal = (Button) findViewById(R.id.button15);
        equal.setOnClickListener(this);
        Button div = (Button) findViewById(R.id.button16);
        div.setOnClickListener(this);
        
        Button mplus = (Button) findViewById(R.id.btnMplus);
        mplus.setOnClickListener(this);
       
        Button mClear = (Button) findViewById(R.id.btnMclear);
        mClear.setOnClickListener(this);
        
        Button mr = (Button) findViewById(R.id.btnMr);
        mr.setOnClickListener(this);
        
        
        Button history = (Button) findViewById(R.id.button17);
        history.setOnClickListener(this);
        
        
        
        
    }
   // 

		public void onClick(View v) {
			
			// TODO Auto-generated method stub
			EditText txt=(EditText)findViewById(R.id.editText1);
			switch(v.getId()){
			case R.id.button1:
				//inc++;
				if(eq==true){
					txt.setText(null);
					eq=false;
				}
				//record[inc]=txt.getText()+"1";
				history=history+"1";
				txt.setText(txt.getText()+"1");
				check=true;
				break;
			case R.id.button2:
				if(eq==true){
					txt.setText(null);
					eq=false;
				}
				//record[inc++]=txt.getText()+"2";
				history=history+"2";
				txt.setText(txt.getText()+"2");
				check=true;
				break;
			case R.id.button3:
				if(eq==true){
					txt.setText(null);
					eq=false;
				}
				history=history+"3";
				txt.setText(txt.getText()+"3");
				check=true;
				break;
			case R.id.button4:
				float temp1,temp2;
				if(check==true){
					add=true;
					history=history+" + ";
					//temp1=value1;
					//temp2=value2;
					value1=Float.parseFloat(txt.getText()+"");
					//txt.setText((value1+value2)+"");
					//value1=value1+value2;
					//temp1=0;
					//temp2=0;
					txt.setText(null);
					
					check=false;
					break;
				}
				else
					break;
			case R.id.button5:
				if(eq==true){
					txt.setText(null);
					eq=false;
				}
				history=history+"4";
				txt.setText(txt.getText()+ "4");
				check=true;
				break;
			case R.id.button6:
				
				if(eq==true){
					txt.setText(null);
					eq=false;
				}
				history=history+" 5 ";
				txt.setText(txt.getText()+"5");
				check=true;
				break;
			case R.id.button7:
				if(eq==true){
					txt.setText(null);
					eq=false;
				}
				history=history+"6";
				txt.setText(txt.getText()+"6");
				check=true;
				break;
			case R.id.button8:
				if(check==true){
					history=history+" - ";
					sub=true;
					value1=Float.parseFloat(txt.getText()+"");
					txt.setText(null);
					check=false;
					break;
				}
				//substraction();
				else
					break;
			case R.id.button9:
				if(eq==true){
					txt.setText(null);
					eq=false;
				}
				history=history+"7";
				txt.setText(txt.getText()+"7");
				check=true;
				break;
			case R.id.button10:
				if(eq==true){
					txt.setText(null);
					eq=false;
				}
				history=history+"8";
				txt.setText(txt.getText()+"8");
				check=true;
				break;
			case R.id.button11:
				if(eq==true){
					txt.setText(null);
					eq=false;
				}
				history=history+"9";
				txt.setText(txt.getText()+"9");
				check=true;
				break;
			case R.id.button12:
				if(check==true){
					mul=true;
					history=history+" * ";
					value1=Float.parseFloat(txt.getText()+"");
					txt.setText(null);
					check=false;
					break;
				}
				//multi();
				else
					break;
			case R.id.button13:
				if(eq==true){
					txt.setText(null);
					eq=false;
				}
				history=history+"0";
				txt.setText(txt.getText()+"0");
				check=true;
				break;
			case R.id.button14:
				if(check==true){
					if(eq==true){
						txt.setText(null);
						eq=false;
					}
					
					txt.setText(txt.getText()+".");
					history=history+txt.getText()+"";
					check=false;
					
					break;
				}
				else{
					
					break;
					
					
				}
					
			
			case R.id.button16:
				
				if(check==true){
					history=history+" / ";
					div=true;
					value1=Float.parseFloat(txt.getText()+"");
					txt.setText(null);
					check=false;
					break;
				}
				
				//division();
				else
					break;
			case R.id.button15:
				
				try{
				//if(value1 == -1 && value2 == -1 ){
				
				//txt.setText("RESULT");
				//record[inc++]=""+txt.getText();
				check=true;
				history=history+" = ";
				value2=Float.parseFloat(txt.getText()+"");
				eq=true;
				if(add==true){
					save=value1 + value2;
					txt.setText(value1 + value2+"");
					add=false;
					//dateFormat.format(cal.getTime())+":"+
					history=history+txt.getText()+"\n";	
					//break;
					
				}
				if(sub==true){
					save= value1 - value2;
					
					txt.setText(value1 - value2+"");
					sub=false;
					history=history+txt.getText()+"\n";
					//break;
				}
				if(mul==true){
					save=value1 * value2;
					txt.setText(value1 * value2+"");
					mul=false;
					history=history+txt.getText()+"\n";
					//break;
				}
				if(div==true){
					//result= value1 / value2;
					save=value1 / value2;
					txt.setText( value1 / value2+"");
					div=false;
					history=history+txt.getText()+"\n";
					//break;
				}
				break;
				}
				catch (Exception e) {
					// TODO: handle exception
					break;
				}
				//}
			//	else
					//break;
				
				//caculation();
				
			case R.id.button17:	
				
				
				Intent intent=new Intent("net.learn2develop.ACTIVITY2");				
				intent.putExtra("message",history);
				//history="";
				startActivity(intent);
				
				//txt.setText("History");
				break;
			case R.id.btnMr:
				try{
				myPreferance = getSharedPreferences(name, MODE_PRIVATE);
				SharedPreferences.Editor editor=myPreferance.edit();
				//editor.putFloat(arg0, arg1)
				editor.putFloat("Data", save);
				editor.commit();
				check=true;
				break;
				}catch (Exception e) {
					break;// TODO: handle exception
				}
			case R.id.btnMplus:
				try{
				//Context context=getActivity();
				//int getvalue;
				//getvalue=;
				myPreferance=getSharedPreferences(name, MODE_PRIVATE);
				txt.setText(myPreferance.getFloat("Data", 0)+"");
				check=true;
				
				break;
				}catch (Exception e) {
					break;// TODO: handle exception
				}
				
			
			case R.id.btnMclear:
				break;
			default:
				break;
				
			}

		}
		
	
	/*public void everyClick(View v) {
		// TODO Auto-generated method stub
				
		
	}*/

}