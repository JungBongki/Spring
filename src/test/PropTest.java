package test;

import java.util.Properties; // 영어사전에 직역하면 재산,소유물,부동산??

public class PropTest {
	private Properties p;

	public Properties getP() {
		return p;
	}

	public void setP(Properties p) {
		this.p = p;
	}
	
	public void printInfo(){
		System.out.println("ip : " + p.getProperty("ip"));
		System.out.println("id : " + p.getProperty("id"));
		System.out.println("pwd : " + p.getProperty("pwd"));
	}
	
}
