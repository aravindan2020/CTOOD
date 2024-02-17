
public class Engine {
	private int hp,id;
	private String type;
	private float w;
	public Engine(int hp, int id, String type, float w) {
		this.hp = hp;
		this.id = id;
		this.type = type;
		this.w = w;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public float getW() {
		return w;
	}
	public void setW(float w) {
		this.w = w;
	}
	@Override
	public String toString() {
		return "Engine [hp=" + hp + ", id=" + id + ", type=" + type + ", w=" + w + "]";
	}
	
	

}
