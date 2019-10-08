# ProjetSIAndBD
Système d’Information de Gestion du budget de fonctionnement d’un Centre de Recherche.

L’objectif de ce sujet est de mettre en place d’un système paramétrable pour la gestion automatisée du budget de fonctionnement d’un Centre de recherche, et l’implémenter au niveau du « Rabat IT Center » de l’Université Mohammed C de Rabat (www.rabat-it-center.org)

	Il s’agit de la gestion des différentes activités liées à la gestion du budget de fonctionnement d’un centre de recherche, depuis l’ajout d’un chercheur dans une structure de recherche équipe ou laboratoire, jusqu’à le de financement et de la validation des différentes activités des structures, en passant par l’acceptation ou le refus des demandes saisie par les chercheurs permanents. 

Plusieurs profils d’utilisateurs dotés de différents niveaux d’autorisation d’accès doivent être envisagés, et en particulier : 
- Responsable de structure : IL a sa propre interface, il gère les demandes de financement au sein de sa structure…
- Directeur du centre : responsable de la prise en charge complète des dépenses et les catégories, il a ses propres interfaces, il gère aussi les demandes de financement au sein du centre …
- Administrateur : responsable de la gestion des chercheur, la gestion des structures de recherches…
- Chercheur : Il a la possibilité de déposer des demandes de financement …

	Les règles de gestion recensées :


	Equipe :
	Une équipe est composée d’au moins 7 membres permanents et d’un nombre indéfini de membres associés.
	Une équipe peut être seule une structure de recherche en étant dans un laboratoire qui ne contient que cette équipe. 
	Une équipe ne peut être dans plusieurs laboratoire ou structure, un et un seul laboratoire qu’est ici le représentant de la structure.

	Laboratoire :
	Un laboratoire est composé d’au moins 18 membres permanents, ou de 3 équipes, en plus d’un nombre indéfini de membres associés, d’une seule équipe, ou de moins de 2 équipes plus des membres permanents.
	Un laboratoire (Structure) peut contenir des membres permanents libres, n’appartenant à aucune de ses équipes

	Structure de recherche :
	Une seule équipe (Un laboratoire qui contient une seule équipe).
	Un laboratoire de 3 équipes plus un nombre indéfini de membres ou seulement 3 équipes.
	Un Laboratoire de moins de 2 équipes plus des membres permanents plus un nombre indéfini de membres associes.

	Membres (Chercheurs) :
	Saisir des demandes, Suivre l’état des demandes, consulter leurs tableaux de bord.
	Deux types de membres : les membres permanents et les membres associes (des membres contributeurs ne sont pas permanents).
	Seuls les membres permanents ont droit d’adresser des demandes de dépenses ou de financements à leur chef de structure.
			


	Centre :
	Un Centre est composé de laboratoires et ou d’équipes, dont le total des membres permanents est 54 au minimum.
	Un Centre ne contient aucun membre « électron libre » n’appartenant à aucune équipe ou à aucun laboratoire.
 
	Dépenses :
	Les dépenses sont saisies et leurs montants par le directeur du centre au début de chaque année.
	Des dépenses peuvent être favorisées plus que d'autres.

	Catégories :
	Une catégorie n’appartient qu’une et une seule dépense.
	Une catégorie est saisie avec son montants par le directeur du centre selon le budget alloue à la dépense principale au début de chaque année. 
	Des catégories peuvent être favorisées plus que d'autres.

	Demandes :
	Les demandes sont adressées au responsable de structure après au directeur.
	Une demande peut être acceptée, refusée ou en cours de traitement. 

	Directeur de centre :
Les pourcentages de répartition du budget par rubriques autorisées sont à définir lors de la phase de planification budgétaire faite par le Directeur du centre :
	Saisir les rubriques autorisées
	Définir les clés de répartition (pourcentages paramétrés, définis par budget)
	Application sur le montant alloué.
	Disposer des statistiques adéquates.
	Collecter et assurer le suivi aux demandes de fonctionnement adressées par les responsables des structures du centre.
	Assurer la Gestion global des demandes de financements, selon le budget alloué et les rubriques à respecter (tableau de bord de gestion financière).



	Responsable de la structure :
Les Responsables de structure de recherche :
	Collecter et assurer le suivi aux demandes de fonctionnement adressées par leurs membres de structure
	Gestion des demandes de financements acceptées, selon le budget alloué à la structure et les rubriques à respecter.
	Agréger les demandes acceptées et les adresser au responsable du Centre 
	Suivre l’état des demandes agrégées adressées au directeur du centre : en cours de traitement, refusée, acceptée.
	Disposer des statistiques adéquates.


	Administrateur :
	Création des chercheurs.
	Création des structures de recherche.
	Administration des structures de recherche (affectation des chercheurs aux structures, etc.).

