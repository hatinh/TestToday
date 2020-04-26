/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import org.junit.Test;
import static org.junit.Assert.*;
import static util.MyToys.cF; //kể từ này về sau class này xài hàm cf() như c
//éo cần Mytoys. gọi tên hàm import static
/**
 *
 * @author Admin
 */
public class MytoysTest {
    

        // mình mún test gì thì ghi ở đây ,là hàm thoy giống DBUTIL
        //test các hàm gõ lệnh here và quan trọng trả  ra màu sắc
        // mỗi tình huống gọi hàm ,ta cần chuẩn bị data ,kì vọng gọi hàm so sánh kết quả
        // ví dụ ta mún test 5! chuẩn bị 5,120 gọi hàm so sánh kết quả
        // với kì vọng
        //tình huống test vs 1 bộ data cho sẵn xem kết quả trả về -> testcase
        //liệt kê test case here
        @Test // biến hàm này thánh main psvm
        public void testSucessfullCases(){
        
            assertEquals(1, cF(0));// KÌ VỌNG ÓI VỀ CON 1 KHI TAO GỌI HÀM CF(0)
            assertEquals(2, cF(2));
            assertEquals(6, cF(3));
            assertEquals(24, cF(4));
            assertEquals(120, cF(5));
            assertEquals(720, cF(6));  // đỏ rồi tức là có 1 sai sót ko khớp kì vọng và trả về từng hàm
               // ai sai mình phải tìm ? mình là dev code ko xong làm j có app 
               //app bị bug biết rồi heng
            
        }
        // ngoại lệ /exception ko dc xem là 1 value để so sánh 
        // ko là value thì ko thể dùng hàm asertEquals (yêu cầu có các value cụ thể)
        @Test(expected = IllegalArgumentException.class)//try catch đó em
        public void testExceptionCases(){
        
            cF(-5); //né m ngoại lệ
        }
    
    
}
// tim đến dong 1005 xóa chữ test
//code viết ổn ko sai cú pháp luôn ra dc file .jar .War .Ear .dll .exe
//TUY NHIÊN CODE CỦA TA CÒN TIỀM ẨN SAI SÓT LOGIC HÀM CHẠY KO  ĐÚNG NHƯNG KO SAI CÚ PHÁP
// VẪN RELEASE DC VÌ RA DC FILE .JAR
// CÓ CÁCH NÀO NGĂN ANT lại code sai logic ,đang màu đỏ éo cho ra file jar
// chơi lớn ép thằng ant mày phải đảm bảo code xanh thông đường pass hết test ko erro về mặt
// giá trị trả về thì ms có clean and built
// Jenkin ,Teamcity,.. là tool công cụ sinh ra giúp những điều ta vừa làm = tay
//nó tự động hóa giùm 
// bất kì ai push code lên giy server thì push kèm bộ data/bộ test 
//jenkin phát hiện có sự thay đổi trên git ,kéo code về /pull về local
//Gọi ant/maven complie/test thử đóng gói nếu test màu xanh 
//nếu test bị đỏ ,nó tự gửi mail về đến thằng vừa push chỉ ra lỗi
//thằng dev nhận mail sửa push lại git Jenkin lặp đi lặp lại 
// cho đến khi thấy màu xanh hoặc dev lầy xóa test đi jenkin ms dùng gửi mail 
//quá trình cứ liên tục liên tục ,dev đẩy code /tích hợp Jenkin cứ tìm màu xanh 
// còn đỏ còn chửi =mail tự đọng CI Continous intergration
//

