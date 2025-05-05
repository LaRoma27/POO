public Movimiento2D(double posicionX, double posicionY, double velocidadX, double velocidadY) {
    this.posicionX = posicionX;
    this.posicionY = posicionY;
    this.velocidadX = velocidadX;
    this.velocidadY = velocidadY;
}

// Método polimórfico: puede ser compartido por otras clases
public void mover(double tiempo) {
    this.posicionX += velocidadX * tiempo;
    this.posicionY += velocidadY * tiempo;
}

// Encapsulamiento: getters y setters
public double getPosicionX() {
    return posicionX;
}

public void setPosicionX(double posicionX) {
    this.posicionX = posicionX;
}

public double getPosicionY() {
    return posicionY;
}

public void setPosicionY(double posicionY) {
    this.posicionY = posicionY;
}

public double getVelocidadX() {
    return velocidadX;
}

public void setVelocidadX(double velocidadX) {
    this.velocidadX = velocidadX;
}

public double getVelocidadY() {
    return velocidadY;
}

public void setVelocidadY(double velocidadY) {
    this.velocidadY = velocidadY;
}

// Método útil para mostrar la posición actual
public String obtenerPosicion() {
    return "(" + posicionX + ", " + posicionY + ")";
}
}
