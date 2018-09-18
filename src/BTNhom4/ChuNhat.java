package BTNhom4;

public class ChuNhat {
	
	private float chieuDai;
	private float chieuRong;

	public ChuNhat(float chieuDai,float chieuRong) {
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}	

	public float Tinh_Dien_Tich()
	{
		return chieuDai*chieuRong;
	}
	
	public float Tinh_Chu_Vi()
	
	{
		return (chieuDai + chieuRong)*2;
	}


}
