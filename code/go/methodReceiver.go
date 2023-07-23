package main

import (
	"fmt"
)

type SuperHero struct {
	name  string
	power string
	HP int8
}

func main() {
	sh := New("DeadPool", "Eats Chimichangas")
	// Prints HP 100
	fmt.Printf("SuperHero: %s\n power: %s\n HP: %d\n", sh.name, sh.power, sh.HP)
	sh.decreaseHP()
	// Prints HP 90
	fmt.Printf("SuperHero: %s\n power: %s\n HP: %d\n", sh.name, sh.power, sh.HP)
}

func New(name string, power string) *SuperHero {
	sh := &SuperHero{ name: name, power: power, HP: 100}
	return sh
}

func (sh *SuperHero) decreaseHP() {
	amount := sh.HP - 10
	sh.HP = amount
}
