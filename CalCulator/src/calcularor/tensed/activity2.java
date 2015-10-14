
package calcularor.tensed;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.xml.sax.DTDHandler;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;


public class activity2 extends Activity{
	String FILENAME="history_file";
	
	public void onCreate(Bundle savedInstanceState){
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity2);
		
		
		
			
		//FileOutputStream fos;
		
		
	}
	@Override
	protected void onResume() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar cal=Calendar.getInstance();
			
		Bundle bundle=getIntent().getExtras();
		String Message=bundle.getString("message");
		int ch;
		StringBuilder strContent=new StringBuilder();
		TextView txt1=(TextView)findViewById(R.id.textView1);
		FileInputStream fis;
		try {
			FileOutputStream fop=openFileOutput("my_file", Context.MODE_PRIVATE);
			fop.write(Message.getBytes());
			fop.flush();
			fop.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			fis = openFileInput("my_file");
			while ((ch = fis.read())!= -1) {
				txt1.setText(dateFormat.format(cal.getTime())+" : " +strContent.append((char)ch));
				
			}
		} catch (FileNotFoundException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		// TODO Auto-generated method stub
		super.onResume();
	}
	

}
