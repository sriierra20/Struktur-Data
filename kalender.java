/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalender;

/**
 *
 * @author Sri Erra
 */

import java.util.Scanner;
public class Kalender {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Masukan Tahun : ");
		int yr = in.nextInt();

                int hari = 2;

		for (int m=1; m<=12; m++)
		{
			String Bulan="";
			int Tgl=0;
			switch (m)
			{
			case 1:
				Bulan="Januari ";
				Tgl=31;
				break;
			case 2:
				Bulan="Februari ";
				if ((yr%4 == 0 && yr%100 != 0) || yr%400 == 0 )
					Tgl=29;
				else Tgl=28;
				break;
			case 3:
				Bulan="Maret ";
				Tgl=31;
				break;
			case 4:
				Bulan="April ";
				Tgl=30;
				break;
			case 5:
				Bulan="Mei ";
				Tgl=31;
				break;
			case 6:
				Bulan="Juni ";
				Tgl=30;
				break;
			case 7:
				Bulan="Juli ";
				Tgl=31;
				break;
			case 8:
				Bulan="Agustus ";
				Tgl=31;
				break;
			case 9:
				Bulan="September ";
				Tgl=30;
				break;
			case 10:
				Bulan="Oktober ";
				Tgl=31;
				break;
			case 11:
				Bulan="November ";
				Tgl=30;
				break;
			case 12:
				Bulan="Desember ";
				Tgl=31;
				break;
			}

			System.out.println("\n             " + Bulan + yr);
			System.out.println("_______________________________________");
			System.out.println("Sun   Mon   Tue   Wed   Thu   Fri   Sat");
			for (int sp=1; sp<=hari; sp++)
					System.out.print("      ");
			for (int p=1; p<=Tgl; p++)
			{	
				if (hari%7==0 && hari!=0)
					System.out.println();
				System.out.printf("%3d   ", p);
				hari+=1;
			}
			hari%=7;
			
			System.out.print("\n\n");
		}
	}
}

