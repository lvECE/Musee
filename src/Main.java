//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Adresse adresse1 = new Adresse(1, "rue de rivoli", "75001", "Paris");

    Salle salle1 = new Salle(1, "salle principale", 85.103);
    Salle salle2 = new Salle(2, "salle antiquités", 50.02);
    Salle salle3 = new Salle(3, "salle renaissance", 50);

    Musee musee = new Musee("Louvre", adresse1, salle1);

    musee.ajouterSalle(salle2);
    musee.ajouterSalle(salle3);

    Artiste artiste1 = new Artiste("De Vinci", "Leonard", "Italien", LocalDate.of(1452, 9, 10));
    Artiste artiste2 = new Artiste("Delacroix", "Eugène", "Français", LocalDate.of(1758, 4, 26));
    Artiste artiste3 = new Artiste("inconnu", "inconnu", "Grec", LocalDate.of(-150, 1, 1));

    Oeuvre oeuvre1 = new Oeuvre("joconde", 1513, 4.5, 2, artiste1);
    Oeuvre oeuvre2 = new Oeuvre("venus de milo", -75, 1.5, 0.75, artiste3);
    Oeuvre oeuvre3 = new Oeuvre("sacre napoléon", 1802, 7, 4.5, artiste2);

    salle1.ajouterOeuvre(oeuvre3);
    salle2.ajouterOeuvre(oeuvre2);
    salle3.ajouterOeuvre(oeuvre1);

    System.out.println("    " + musee.getNom() + "    ");
    System.out.println("Adresse : " + adresse1.getNumero() + " "
            + adresse1.getRue() + ", "
            + adresse1.getCodePostal() + " "
            + adresse1.getVille());
    System.out.println("Nombre de salles : " + musee.getSalles().size());
    for (Salle salle : musee.getSalles()) {
        System.out.println("\n--- " + salle.getNom() + " (étage " + salle.getEtage() + ") ---");
        for (Oeuvre oeuvre : salle.getOeuvres()) {
            System.out.println("  Oeuvre : " + oeuvre.getNom() + " (" + oeuvre.getAnnee() + ")");
            if (oeuvre.getArtiste() != null) {
                System.out.println("  Artiste : " + oeuvre.getArtiste().getPrenom()
                        + " " + oeuvre.getArtiste().getNom()
                        + " (" + oeuvre.getArtiste().getNationalite() + ")");
            } else {
                System.out.println("  Artiste : inconnu");

            }
        }
    }
}