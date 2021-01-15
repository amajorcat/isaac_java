package util;

public class Bullet extends GameObject{
	
	private Vector3f direction = new Vector3f(0,0,0);
	private float speed = 10;
	
	public Bullet(String textureLocation,int width,int height,Point3f centre, Vector3f direction) { 
		super(textureLocation, width, height, centre);
		this.setDirection(direction);
	}
	
	public float getSpeed() {
		return speed;
	}
	
	public void setSpeed(float speed) {
		this.speed = speed;
	}

	public Vector3f getDirection() {
		return direction;
	}

	public void setDirection(Vector3f direction) {
		this.direction = direction;
	}
}
