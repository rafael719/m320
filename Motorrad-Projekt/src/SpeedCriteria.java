class SpeedCriteria implements SearchCriteria {
    private int minSpeed;

    public SpeedCriteria(int minSpeed) {
        this.minSpeed = minSpeed;
    }

    @Override
    public boolean matches(Motorcycle motorcycle) {
        return motorcycle.maxSpeed >= minSpeed;
    }
}
