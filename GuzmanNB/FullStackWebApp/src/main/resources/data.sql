-- Insert sample users
INSERT INTO User (username, email, password, role) VALUES
('john_doe', 'john@example.com', 'hashed_password_1', 'CUSTOMER'),
('jane_doe', 'jane@example.com', 'hashed_password_2', 'ADMIN');

-- Insert sample products
INSERT INTO Product (name, description, price, stock, category) VALUES
('Product 1', 'Description of Product 1', 99.99, 50, 'Electronics'),
('Product 2', 'Description of Product 2', 19.99, 100, 'Books');

-- You can add more sample data as needed