import java.util.Arrays;
import java.util.Scanner;

public class String7_34 {

	public static void main(String[] args) {
		//�½�һ���ַ���������ʾ�û�����һ���ַ���
        String str = "";
        Scanner input = new Scanner(System.in);
        System.out.print("������һ���ַ�����");
        //�����û����룬String����
        str = input.nextLine();
        //���÷���sort�������ַ������룬ʹ��ԭ�ַ����������
        str = sort(str);
        //����ַ�������
        System.out.print(str);
    }
    public static String sort(String s){
        //��ȡ�ַ������ȣ���ֵ��length
        int length = s.length();
        //�½�һ��char�����飬����Ϊlength
        char[] ch = new char[length];
        //�����ַ�����charAt()�������ַ�����ÿ���ַ����ݸ�char������
        for ( int i = 0 ; i < length ; i++){
            ch[i] = s.charAt(i);
        }
        //�������������Arrays.sort()��
        Arrays.sort(ch);
        //��������б�����ÿ��Ԫ�ؼӵ��ַ����У������ַ���
        String str = "";
        for (int i = 0 ; i < length ; i++){
            str += ch[i];
        }
        return str;

	}

}
