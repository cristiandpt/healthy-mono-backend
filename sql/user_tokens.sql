CREATE TABLE IF NOT EXISTS user_tokens (
    user_id        UUID          NOT NULL,
    auth_provider  VARCHAR(250)  NOT NULL,
    name           VARCHAR(250)  NOT NULL,
    value          TEXT          NULL,
    PRIMARY KEY (user_id, login_provider, name)
);
