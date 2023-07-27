package main

import (
	"fmt"
)

type Position struct {
	x float32
	y float32
}

func (p *Position) move(x float32, y float32) {
	p.x += x;
	p.y += y;
}

type SuperHero struct {
	Position // Inherit Methods/Fields from Position Struct
	name  string
	power string
	HP int8
}

func main() {
	sh := New("DeadPool", "Eats Chimichangas")
	fmt.Printf("Hero position X: %f, position Y: %f\n", sh.Position.x, sh.Position.y)
	sh.move(25.1, 33.9)
	fmt.Printf("Hero position X: %f, position Y: %f\n", sh.Position.x, sh.Position.y)
}

func New(name string, power string) *SuperHero {
	sh := &SuperHero{ name: name, power: power, HP: 100}
	return sh
}
