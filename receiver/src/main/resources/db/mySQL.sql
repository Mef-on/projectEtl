-- 'users'
CREATE TABLE users (
  user_id INT AUTO_INCREMENT PRIMARY KEY,
  username VARCHAR(255) NOT NULL,
  pesel VARCHAR(11) NOT NULL,
  birthdate DATE NOT NULL
);

-- 'cars'
CREATE TABLE cars (
  car_id INT AUTO_INCREMENT PRIMARY KEY,
  model VARCHAR(255) NOT NULL,
  brand VARCHAR(255) NOT NULL,
  vin VARCHAR(17) NOT NULL
);

-- 'users_cars'
CREATE TABLE users_cars (
  user_id INT,
  car_id INT,
  PRIMARY KEY (user_id, car_id),
  FOREIGN KEY (user_id) REFERENCES users(user_id),
  FOREIGN KEY (car_id) REFERENCES cars(car_id)
);
