ALTER TABLE products
    ADD COLUMN description TEXT;

ALTER TABLE products
    ALTER COLUMN description SET NOT NULL;