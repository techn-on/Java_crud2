
import java.util.*;


public class WordManager {
    Scanner s= new Scanner(System.in);
    WordCrud wordCrud;

    WordManager(){
        wordCrud= new WordCrud(s);
    }
    public int selectMenu(){
        System.out.println(
                """
                        ************************
                        1. 모든 단어 보기
                        2. 수준별 단어 보기
                        3. 단어 검색
                        4. 단어 추가
                        5. 단어 수정
                        6. 단어 삭제
                        7. 파일 저장
                        0. 나가기
                        ************************
                        => 원하는 메뉴는 ?\s""");
       return s.nextInt();
    }
    public void start () {
        wordCrud.loadFile();
        while (true) {
            int menu = selectMenu();
            if (menu == 0)
                break;
            if (menu == 4) {
                wordCrud.addItem();
                // menu 5
            } else if (menu == 1) {
                wordCrud.listAll();
            }else if (menu==2){
                wordCrud.searchLevel();
            } else if (menu==3) {
                wordCrud.searchWord();

            } else if (menu == 5) {
                wordCrud.updateItem();

            } else if (menu == 6) {
                wordCrud.deleteItem();
            }
            else if (menu ==7){
                wordCrud.saveFile();

            }
        }
    }}
