package BTNhom4;

public class TamGiac {
	private float canhNgan;
	private float canhDai;
	private float canhDay;
	private float duongCao;
	
	public TamGiac(float canhNgan,float canhDai, float canhDay, float duongCao ) {
		this.canhNgan = canhNgan;
		this.canhDai = canhDai;
		this.canhDay = canhDay;
		this.duongCao = duongCao;
	}
	
	public float Tinh_Dien_Tich()
	{
		return (duongCao*canhDay)/2;
	}
	
	public float Tinh_Chu_Vi()
	
	{
		return canhNgan + canhDai + canhDay;
	}

}
