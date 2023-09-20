public class Plant extends Entity {

    public Plant(EntityType type) {
        super(type);
    }

    @Override
    public Entity multiply() {
        return Entity.createEntity(this.getType());
    }

    @Override
    public void changeWeight() {

    }


}