package net.datafaker;

/**
 * @since 0.9.0
 */
public class EnglandFootBall {

    private final Faker faker;

    protected EnglandFootBall(final Faker faker) {
        this.faker = faker;
    }

    public String league() {
        return faker.fakeValuesService().resolve("englandfootball.leagues", this, faker);
    }

    public String team() {
        return faker.fakeValuesService().resolve("englandfootball.teams", this, faker);
    }
}
