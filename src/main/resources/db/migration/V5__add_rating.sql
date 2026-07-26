CREATE TABLE revchanges
(
    rev        BIGINT NOT NULL,
    entityname VARCHAR(255) NULL
);

CREATE TABLE revinfo
(
    rev      BIGINT NOT NULL,
    revtstmp BIGINT NULL,
    CONSTRAINT pk_revinfo PRIMARY KEY (rev)
);

ALTER TABLE driver
    ADD CONSTRAINT FK_DRIVER_ON_HOME FOREIGN KEY (home_id) REFERENCES exact_location (id);

ALTER TABLE driver
    ADD CONSTRAINT FK_DRIVER_ON_LASTKNOWNLOCATION FOREIGN KEY (last_known_location_id) REFERENCES exact_location (id);

ALTER TABLE revchanges
    ADD CONSTRAINT fk_revchanges_on_default_tracking_modified_entities_changelog FOREIGN KEY (rev) REFERENCES revinfo (rev);

ALTER TABLE driver
    MODIFY rating DOUBLE NOT NULL;