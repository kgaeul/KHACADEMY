import java.io.File;

public class File_Rename_Main {

	public static void main(String[] args) {

		String mainPath = "C:\\Users\\user1\\Desktop\\";
		String originFile = "C:\\Users\\user1\\Pictures\\abc.png";
		String newFile = "C:\\Users\\user1\\Pictures\\cuuuuuuute.png";
		
		File current = new File(originFile);
		File renameFile = new File(newFile);
		
		System.out.println(mainPath);
		if(current.renameTo(renameFile)) {
			System.out.println("�����̸� ���漺��!");
		}else {
			System.out.println("���� �̸� ���� ���ص��̤̤�");
		}
		
	}

}
