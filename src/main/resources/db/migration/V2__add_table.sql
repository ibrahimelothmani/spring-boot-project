CREATE TABLE location
(
    id        BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    name      VARCHAR(255)     NOT NULL,
    latitude  DOUBLE PRECISION NOT NULL,
    longitude DOUBLE PRECISION NOT NULL,
    user_id   BIGINT           NOT NULL,
    CONSTRAINT location_users_id_fk
        FOREIGN KEY (user_id) REFERENCES users (id)
);