package semi.main.bean;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class MainVO 
{
	private String tst_cd;
	private String name;
	
	public String getTst_cd() {
		return tst_cd;
	}
	public void setTst_cd(String tst_cd) {
		this.tst_cd = tst_cd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}