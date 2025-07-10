CREATE TABLE IF NOT EXISTS specialties (
  id                     SERIAL            PRIMARY KEY,
  name                   VARCHAR(100)      NOT NULL,
  description            TEXT              NOT NULL,
  tenant_id              INTEGER           NOT NULL,
  is_active              BOOLEAN           NOT NULL,
  image_url              VARCHAR(2048)     NOT NULL,
  is_doctor_managed_rate BOOLEAN           NOT NULL, -- The rate in this context to refer to price or the tariff
  consultation_rate      DOUBLE PRECISION  NOT NULL,
  video_call_rate        DOUBLE PRECISION  NOT NULL,
  video_call_minutes     INTEGER           NOT NULL
);
