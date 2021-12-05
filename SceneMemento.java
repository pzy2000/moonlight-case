public class SceneMemento{
    private String scene;
    private int lifeValue;
    SceneMemento(String scene,int lifeValue)
    {
        this.scene=scene;
        this.lifeValue=lifeValue;
    }
    void setScene(String scene)
    {
        this.scene=scene;
    }
    void setLifeValue(int lifeValue)
    {
        this.lifeValue=lifeValue;
    }
    String getScene()
    {
        return (this.scene);
    }
    int getLifeValue()
    {
        return (this.lifeValue);
    }
}
