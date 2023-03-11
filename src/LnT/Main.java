package LnT;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;
import java.util.Random;

public class Main {
	Scanner scan = new Scanner (System.in);
	Vector<Pegawai> pega = new Vector<Pegawai>();
	
	public Main() {
		int nomor;
		do {
			System.out.println("Pilih nomor menu dibawah:");
			System.out.println("1. Insert data karyawan");
			System.out.println("2. View data karyawan");
			System.out.println("3. Update data karyawan");
			System.out.println("4. Delete data karyawan");
			System.out.println("5. End");
			System.out.print("Nomor: ");
			try {
				nomor = scan.nextInt();
				scan.nextLine();
			} catch (Exception e) {
				nomor = -1;
				scan.nextLine();
				System.out.println("Tolong masukkan nomor yang benar");
				continue;
			}
				switch (nomor) {
					case 1:
						insertdata();
						 break;
					case 2:
						if(pega.size()>0) {
							viewdata();
						} else {
							System.out.println("Data karyawan tidak ada");
							System.out.print("ENTER to return"); scan.nextLine();
						}	
						break;
					case 3:
						if(pega.size()>0) {
							updatedata();
						}else {
							System.out.println("Tidak ada data yang bisa diupdate");
							System.out.print("ENTER to return"); scan.nextLine();
						}
						break;
					case 4:
						if(pega.size()>0) {
							deletedata();
						}else {
							System.out.println("Tidak ada data yang bisa dihapus");
							System.out.print("ENTER to return"); scan.nextLine();
						}
						break;
					case 5:
						System.out.println("==========Terima kasih===========");
						break;
					default:
						System.out.println("Tolong masukkan nomor yang benar");
						System.out.print("ENTER to return"); scan.nextLine();
						break;
				}
		} while (nomor != 5);
		}
	private static final String listabjad = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static final int length = 4;
	
	public void insertdata() {
		listdata(1);
	}
	
	public void listdata(int i) {
		
		String code;
		String name;
		String gender;
		String role;
		double income;
		
		if(i==0) {
		    while (true) {
		        System.out.print("Input nama karyawan [>= 3]: ");
		        name = scan.nextLine();
		        if (name.length() >= 3) {
		            break;
		        }
		        System.out.println("==Nama karyawan minimal 3 huruf==");
		        
		    while (true) {
		        System.out.print("Input jenis kelamin [Laki-Laki | Perempuan] (Case Sensitive): ");
		        gender = scan.nextLine();
		        if (gender.equals("Laki-Laki") || gender.equals("Perempuan")) {
		            break;
		        }
		        System.out.println("==Jenis kelamin harus Laki-Laki atau Perempuan==");
		    }
		    while (true) {
		        System.out.print("Input jabatan [Manager | Supervisor | Admin] (Case Sensitive): ");
		        role = scan.nextLine();
		        if (role.equals("Manager") || role.equals("Supervisor") || jabatan.equals("Admin")) {
		            break;
		        }
		        System.out.println("==Jabatan harus Manager, Supervisor, atau Admin==");
		    }
		}
		else if(i==-1){
		    while (true) {
		        System.out.print("Input nama karyawan [>= 3]: ");
		        name = scan.nextLine();
		        if (name.length() >= 3) {
		            break;
		        }
		        System.out.println("==Nama karyawan minimal 3 huruf==");
		    }
		    while (true) {
		        System.out.print("Input jenis kelamin [Laki-Laki | Perempuan] (Case Sensitive): ");
		        gender = scan.nextLine();
		        if (gender.equals("Laki-Laki") || gender.equals("Perempuan")) {
		            break;
		        }
		        System.out.println("==Jenis kelamin harus Laki-Laki atau Perempuan==");
		    }
		    while (true) {
		        System.out.print("Input jabatan [Manager | Supervisor | Admin] (Case Sensitive): ");
		        role = scan.nextLine();
		        if (role.equals("Manager") || role.equals("Supervisor") || role.equals("Admin")) {
		            break;
		        }
		        System.out.println("= Jabatan harus Manager, Supervisor, atau Admin =");
		    }
		    
	    	int TManager = 0;
	    	int TSupervisor = 0;
	    	int TAdmin = 0;
	    	
	    	if (role.equals("Manager")) {
	    		  TManager++;
	    		  Random random = new Random();
	    		  StringBuilder sb = new StringBuilder();
	    		  for (int p=0; p<2; p++) {
	    		    sb.append(listabjad.charAt(random.nextInt(listabjad.length())));
	    		  }
	    		  sb.append("-");
	    		  for (int p=0; p<Length; p++) {
	    		    sb.append(random.nextInt(10));
	    		  }
	    		  code = sb.toString();
	    		  income = 8000000;

	    		  if(TManager/3 !=0) {
	    		    double bonus = 0.075*income;
	    		    income += bonus;

	    		    System.out.println("Bonus sebesar 7.5% telah diberikan pada " + (3*(TManager/3)) + " karyawan Manager dengan id ");
	    		    for(int q=0; q<(3*(TManager/3)); q++) {
	    		      String temp = pega.get(z).getCodeK();
	    		      System.out.print(temp + " ");
	    		    }
	    		    System.out.println();
	    		  }

	    		  Manager q = new Manager(code, name, gender, role, income);
	    		  pega.add(q);
	    		  System.out.println("Berhasil menambahkan karyawan dengan id " + code);
	    		  System.out.print("ENTER to return"); scan.nextLine();
	    		} 
	    	else if(role.equals("Supervisor")) {
	    		  TSupervisor++;
	    		  Random random = new Random();
	    		  StringBuilder sb = new StringBuilder();
	    		  for (int p=0; p<2; p++) {
	    		    sb.append(listabjad.charAt(random.nextInt(listabjad.length())));
	    		  }
	    		  sb.append("-");
	    		  for (int p=0; p<Length; p++) {
	    		    sb.append(random.nextInt(10));
	    		  }
	    		  code = sb.toString();
	    		  income = 6000000;

	    		  if(TSupervisor/3 != 0) {
	    		    double bonus = 0.075*income;
	    		    income += bonus;

	    		    System.out.println("Bonus sebesar 7.5% telah diberikan pada " + (3*(TSupervisor/3)) + " karyawan Supervisor dengan id ");
	    		    for(int q=0; q<(3*(TSupervisor/3)); q++) {
	    		      String temp = pega.get(z).getCodeK();
	    		      System.out.print(temp + " ");
	    		    }
	    		    System.out.println();
	    		  }

	    		  superVisor r = new superVisor(code, name, gender, role, income);
	    		  pega.add(r);
	    		  System.out.println("Berhasil menambahkan karyawan dengan id " + code);
	    		  System.out.print("ENTER to return"); scan.nextLine();
	    		}
	    	
		    else if(role.equals("Admin")) {
		    	  TAdmin++;
		    	  Random random = new Random();
		    	  StringBuilder sb = new StringBuilder();
		    	  for (int p=0; p<2; p++) {
		    	    sb.append(listabjad.charAt(random.nextInt(listabjad.length())));
		    	  }
		    	  sb.append("-");
		    	  for (int p=0; p<Length; p++) {
		    	    sb.append(random.nextInt(10));
		    	  }
		    	  code = sb.toString();
		    	  income = 4000000;
		    	  
		    	  int TAdminB = TAdmin - 1;
		    	  if((int)TAdminB/3 != 0) {
		    	    double bonus = 0.05*gaji;
		    	    gaji += bonus;
		    	    
		    	    int FirstId = TAdminB - (3*(TAdminB/3));
		    	    System.out.print("Bonus sebesar 5% telah diberikan pada dengan id ");
		    	    for(int q=FirstId; q<TAdminB; q++) {
		    	      String temp = pega.get(q).getCodeK();
		    	      System.out.print(temp + " ");
		    	    }
		    	    System.out.println();
		    	  }
		    	  
		    	  Admin s = new Admin(code,name,gender,role,income);
		    	  pega.add(s);
		    	  System.out.println("Berhasil menambahkan karyawan dengan id " + code);
	    		  System.out.print("ENTER to return"); scan.nextLine();
		    	}
		}
		else {
			while (true) {
		        System.out.print("Input nama karyawan [>= 3]: ");
		        name = scan.nextLine();
		        if (name.length() >= 3) {
		            break;
		        }
		        System.out.println("==Nama karyawan minimal 3 huruf==");
		    }
		    while (true) {
		        System.out.print("Input jenis kelamin [Laki-Laki | Perempuan] (Case Sensitive): ");
		        gender = scan.nextLine();
		        if (gender.equals("Laki-Laki") || gender.equals("Perempuan")) {
		            break;
		        }
		        System.out.println("==Jenis kelamin harus Laki-Laki atau Perempuan==");
		    }
		    while (true) {
		        System.out.print("Input jabatan [Manager | Supervisor | Admin] (Case Sensitive): ");
		        gender = scan.nextLine();
		        if (gender.equals("Manager") || gender.equals("Supervisor") || gender.equals("Admin")) {
		            break;
		        }
		        System.out.println("= Jabatan harus Manager, Supervisor, atau Admin =");
		    }
		    
	    	int TManager = 0;
	    	int TSupervisor = 0;
	    	int TAdmin = 0;
	    	
	    	if (role.equals("Manager")) {
	    		  TManager++;
	    		  Random random = new Random();
	    		  StringBuilder sb = new StringBuilder();
	    		  for (int p=0; p<2; p++) {
	    		    sb.append(listabjad.charAt(random.nextInt(listabjad.length())));
	    		  }
	    		  sb.append("-");
	    		  for (int p=0; p<Length; p++) {
	    		    sb.append(random.nextInt(10));
	    		  }
	    		  code = sb.toString();
	    		  income = 8000000;

	    		  if(TManager/3 !=0) {
	    		    double bonus = 0.075*income;
	    		    income += bonus;

	    		    System.out.println("Bonus sebesar 7.5% telah diberikan pada " + (3*(TManager/3)) + " karyawan Manager dengan id ");
	    		    for(int q=0; q<(3*(TManager/3)); q++) {
	    		      String temp = pega.get(q).getCodeK();
	    		      System.out.print(temp + " ");
	    		    }
	    		    System.out.println();
	    		  }

	    		  Manager s = new Manager(code, name, gender, role, income);
	    		  pega.add(s);
	    		} 
	    	else if(role.equals("Supervisor")) {
	    		  TSupervisor++;
	    		  Random random = new Random();
	    		  StringBuilder sb = new StringBuilder();
	    		  for (int p=0; p<2; p++) {
	    		    sb.append(listabjad.charAt(random.nextInt(listabjad.length())));
	    		  }
	    		  sb.append("-");
	    		  for (int p=0; p<Length; p++) {
	    		    sb.append(random.nextInt(10));
	    		  }
	    		  code = sb.toString();
	    		  income = 6000000;

	    		  if(TSupervisor/3 != 0) {
	    		    double bonus = 0.075*income;
	    		    income += bonus;

	    		    System.out.println("Bonus sebesar 7.5% telah diberikan pada " + (3*(jumlahSupervisor/3)) + " karyawan Supervisor dengan id ");
	    		    for(int q=0; q<(3*(TSupervisor/3)); q++) {
	    		      String temp = pega.get(q).getCodeK();
	    		      System.out.print(temp + " ");
	    		    }
	    		    System.out.println();
	    		  }

	    		  superVisor t = new superVisor(code, name, gender, role, income);
	    		  pega.add(t);
	    		}
	    	
		    else if(jabatan.equals("Admin")) {
		    	  jumlahAdmin++;
		    	  Random random = new Random();
		    	  StringBuilder sb = new StringBuilder();
		    	  for (int j = 0; j < 2; j++) {
		    	    sb.append(ALPHABET.charAt(random.nextInt(ALPHABET.length())));
		    	  }
		    	  sb.append("-");
		    	  for (int j = 0; j < LENGTH; j++) {
		    	    sb.append(random.nextInt(10));
		    	  }
		    	  kode = sb.toString();

		    	  gaji = 4000000;
		    	  
		    	  int jumlahAdminSebelumnya = jumlahAdmin - 1;
		    	  if((int)jumlahAdminSebelumnya/3 != 0) {
		    	    double bonus = 0.05*gaji;
		    	    gaji += bonus;
		    	    
		    	    int indexAwal = jumlahAdminSebelumnya - (3*(jumlahAdminSebelumnya/3));
		    	    System.out.print("Bonus sebesar 5% telah diberikan pada dengan id ");
		    	    for(int z = indexAwal ; z < jumlahAdminSebelumnya  ; z++) {
		    	      String temp = pegawae.get(z).getKodeKaryawan();
		    	      System.out.print(temp + " ");
		    	    }
		    	    System.out.println();
		    	  }
		    	  
		    	  Admin a = new Admin(kode,nama,jenisKelamin,jabatan,gaji);
		    	  pegawae.add(a);
		    	}
		}
	}
	
	
	
	
	
	
	}
}
