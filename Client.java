public class Client {
    public static void main(String a[])
    {
        GameScene scene=new GameScene();
        Caretaker pzy=new Caretaker();
        System.out.println("月光宝盒开始运行（基于备忘录模式）");
        scene.setScene("仙灵岛");
        scene.setLifeValue(6);
        System.out.println("原始状态：");
        scene.display();
        pzy.setSceneMemento(scene.save());
        System.out.println("-----------------");

        scene.setScene("万蝠古窟");
        scene.setLifeValue(0);
        System.out.println("牺牲状态：");
        scene.display();
        System.out.println("-----------------");

        scene.restore(pzy.getSceneMemento());
        System.out.println("已恢复存档：");
        scene.display();
        System.out.println("-----------------");
    }
}
