package BTNhom4;

public class HinhTron {
	private double banKinh;

	public HinhTron(float banKinh) {
		this.banKinh = banKinh;
	}
	
	public double Tinh_Dien_Tich()
	{
		return (banKinh*banKinh)*3.14;
	}
	
	public double Tinh_Chu_Vi()
	{
		return banKinh*2*3.14;
	}

}
