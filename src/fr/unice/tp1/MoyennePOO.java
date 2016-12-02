package fr.unice.tp1;

class MoyennePOO {
    int notes = 0;
    int nombreDeNotes = 0;

    void ajouteNote(int note) {
		notes += note;
		nombreDeNotes += 1;
    }

    void ajouteNoteExamen(int note) {
	//ajouteNote(note
    }

    double calculMoyenne() {
	return ((double)notes) / nombreDeNotes;
    }
}
