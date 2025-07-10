CREATE TABLE IF NOT EXISTS users (
  id                       UUID PRIMARY KEY NOT NULL,
  access_failed_count      INTEGER          NOT NULL,
  concurrency_stamp        UUID             NULL,
  email                    VARCHAR(256)     NULL,
  email_confirmed          BOOLEAN          NOT NULL,
  lockout_enabled          BOOLEAN          NOT NULL,
  lockout_end              TIMESTAMPTZ      NULL,
  normalized_email         VARCHAR(256)     NULL,
  normalized_user_name     VARCHAR(256)     NULL,
  password_hash            TEXT             NULL,
  phone_number             TEXT             NULL,
  phone_number_confirmed   BOOLEAN          NOT NULL,
  security_stamp           UUID             NULL,
  two_factor_enabled       BOOLEAN          NOT NULL,
  user_name                VARCHAR(256)     NULL,
  display_name             VARCHAR(256)     NULL
);
