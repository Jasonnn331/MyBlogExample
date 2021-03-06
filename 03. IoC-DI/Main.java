/**
 * Created by zhengzhongsheng on 2016/11/22.
 */
public class Main {
    public static void main(String[] args) {

        ServiceContainer container = new ServiceContainer(); // 實例 容器

//        // 註冊依賴關係： 當遇到 『Game』，讓容器給我 『爆爆王』
//        container.bind(Game.class, 爆爆王.class);
//
//        // 註冊依賴關係： 當遇到 『Computer』，讓容器給我 『Computer(Game,100)』
//        // 並且 因為上面已註冊過 Game ， 容器會直接傳回『爆爆王』給我
//        container.bind(Computer.class, Game.class, 100);
//
//        Computer computer = (Computer) container.make(Computer.class); // 讓容器製作 Computer
//        computer.playGame(); // 使用已被注入依賴的 Computer 物件

        // 註冊依賴關係： 當遇到 『Game』，讓容器給我 『英雄聯盟』
        container.bind(Game.class, 英雄聯盟.class);

        // 註冊依賴關係： 當遇到 『Computer』，讓容器給我 『Computer(Game,true)』
        // 並且 因為上面已註冊過 Game ， 容器會直接傳回『英雄聯盟』給我
        container.bind(Computer.class, Game.class, true);


        Computer computer1 = (Computer) container.make(Computer.class); // 讓容器製作 Computer
        computer1.playGame(); // 使用已被注入依賴的 Computer 物件
    }
}


