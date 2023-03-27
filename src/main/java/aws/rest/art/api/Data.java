package aws.rest.art.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import aws.rest.art.api.model.Artist;
import aws.rest.art.api.model.Artwork;
import lombok.Getter;

@Component
@Getter
public class Data {

        private List<Artist> allArtists = new ArrayList<>(
                        Arrays.asList(
                                        new Artist(
                                                        "Van Gogh",
                                                        "https://images.metmuseum.org/CRDImages/ep/original/DT1502_cropped2.jpg",
                                                        "Netherlands",
                                                        "Post-Impressionism",
                                                        "Vincent Willem van Gogh was a Dutch Post-Impressionist artist who emerged as one of the most famous figures in the history of Western art after his death. Van Gogh's landscapes, still lifes, portraits, and self-portraits are characterized by vibrant contrasts of complementary colors, expressive brushwork, and abstract, linear planes inspired by the Japanese prints he collected and admired. His innovations contributed to the foundations of modern art. Van Gogh's images often reflect personal symbolism, experiences, and emotions he discussed in correspondence with family and friends. He expressed a desire to communicate joy and comfort through his art and aspired to gather a community of like-minded artists in southern France. Van Gogh did not achieve commercial success in his lifetime and relied on financial support from his brother, Theo van Gogh. His life was shaped by severe depression and episodes of acute psychological distress. Van Gogh committed suicide at the age of 37",
                                                        "Vincent Willem van Gogh",
                                                        "07-29-1890",
                                                        "03-30-1853",
                                                        "France",
                                                        Arrays.asList(
                                                                        new Artwork(
                                                                                        "https://www.moma.org/media/W1siZiIsIjQ2NzUxNyJdLFsicCIsImNvbnZlcnQiLCItcXVhbGl0eSA5MCAtcmVzaXplIDIwMDB4MjAwMFx1MDAzZSJdXQ.jpg?sha=314ebf8cc678676f",
                                                                                        "Starry Night",
                                                                                        "Van Gogh created this painting after a major mental breakdown and felt depressed and suicidal. The swirls in the sky reflect his emotional turbulence. The scene of this painting depicts the views of Saint-Rémy-de-Provence that Van Gogh saw from his bedroom window",
                                                                                        "1889"),
                                                                        new Artwork(
                                                                                        "https://upload.wikimedia.org/wikipedia/commons/thumb/2/21/Vincent_Willem_van_Gogh_-_Cafe_Terrace_at_Night_%28Yorck%29.jpg/816px-Vincent_Willem_van_Gogh_-_Cafe_Terrace_at_Night_%28Yorck%29.jpg",
                                                                                        "Cafe Terrace at Night",
                                                                                        "Van Gogh set up his easel outdoors and in the evening hours to paint this scene. This was a practice that he picked up from the impressionists in Paris. However, he did not paint the scene as he observed it but rather used color and brushwork to express his emotions. In this painting, Van Gogh portrays excitement and pleasure",
                                                                                        "1888"),
                                                                        new Artwork(

                                                                                        "https://images.metmuseum.org/CRDImages/ep/original/DP229743.jpg",
                                                                                        "Sunflowers",
                                                                                        "Van Gogh wanted to decorate his guest's bedroom (Paul Gauguin) as he was joining Willem in Arles so that they could paint together",
                                                                                        "1888"),
                                                                        new Artwork(

                                                                                        "https://iiif.micr.io/ZKSPH/full/1280,/0/default.jpg",
                                                                                        "The Bedroom",
                                                                                        "While he was in Arles, Van Gogh made this painting of his bedroom in the Yellow House. He prepared the room himself with simple furniture and with his own work on the wall",
                                                                                        "1888"),
                                                                        new Artwork(
                                                                                        "https://upload.wikimedia.org/wikipedia/commons/thumb/6/68/Vincent_van_Gogh_-_Almond_blossom_-_Google_Art_Project.jpg/2560px-Vincent_van_Gogh_-_Almond_blossom_-_Google_Art_Project.jpg",
                                                                                        "Almond Blossom",
                                                                                        "Large blossom branches against a blue sky. Almond trees flower early in the spring making them a symbol of new life",
                                                                                        "1890"))),
                                        new Artist(
                                                        "Rembrandt",
                                                        "https://upload.wikimedia.org/wikipedia/commons/5/55/Rembrandt_Self-Portrait_%28Royal_Collection%29.jpg",
                                                        "Netherlands",
                                                        "null",
                                                        null,
                                                        "Rembrandt Harmenszoon van Rijn",
                                                        "10-04-1669",
                                                        "7-15-1606",
                                                        "Netherlands",
                                                        Arrays.asList(
                                                                        new Artwork(
                                                                                        "https://upload.wikimedia.org/wikipedia/commons/thumb/0/0b/Rembrandt_van_Rijn-De_Nachtwacht-1642.jpg/2449px-Rembrandt_van_Rijn-De_Nachtwacht-1642.jpg",
                                                                                        "The Night Watch",
                                                                                        "The Night Watch is a group portrait of the militia company of Captain Frans Banning Cocq and Lieutenant Willem van Ruytenburgh (in the center)",
                                                                                        "1642"),
                                                                        new Artwork(
                                                                                        "https://upload.wikimedia.org/wikipedia/commons/thumb/4/4d/Rembrandt_-_The_Anatomy_Lesson_of_Dr_Nicolaes_Tulp.jpg/2560px-Rembrandt_-_The_Anatomy_Lesson_of_Dr_Nicolaes_Tulp.jpg",
                                                                                        "The Anatomy Lesson of Dr. Nicolaes Tulp",
                                                                                        "The painting depicts the Dutch surgeon and the later mayor of Amsterdam Dr. Nicolaes Tulp holding an anatomy lesson on the corpse of the executed criminal Aris Kindt",
                                                                                        "1632"),
                                                                        new Artwork(
                                                                                        "https://upload.wikimedia.org/wikipedia/commons/thumb/9/99/Rembrandt_Self-portrait_%28Kenwood%29.jpg/1200px-Rembrandt_Self-portrait_%28Kenwood%29.jpg",
                                                                                        "Self-Portrait with Two Circles",
                                                                                        "Rembrandt's self-portraits shows the artist at work. He is depicted holding his palette, brushes, and maulstick with two enigmatic circles in the background",
                                                                                        "1669"),
                                                                        new Artwork(
                                                                                        "https://upload.wikimedia.org/wikipedia/commons/f/f3/Rembrandt_Christ_in_the_Storm_on_the_Lake_of_Galilee.jpg",
                                                                                        "The Storm on the Sea of Galilee",
                                                                                        "The painting, in vertical format, shows a close-up view of Christ's disciples struggling frantically against the heavy storm to regain control of their fishing boat",
                                                                                        "1633"),
                                                                        new Artwork(
                                                                                        "https://upload.wikimedia.org/wikipedia/commons/8/88/Rembrandt_Harmensz._van_Rijn_026.jpg",
                                                                                        "Danaë",
                                                                                        "It depicts Danaë, the mother of the ancient Greek mythological hero Perseus. The life-sized depiction of Danaë is thought to show her welcoming Zeus who came to her in the form of golden rain",
                                                                                        "1636"))),
                                        new Artist(
                                                        "Picasso",
                                                        "https://static.wixstatic.com/media/a36bfa_14e610c98eb84f0692b7ab61656178c2~mv2_d_3036_4048_s_4_2.jpg/v1/fill/w_3036,h_4048,al_c,q_85/a36bfa_14e610c98eb84f0692b7ab61656178c2~mv2_d_3036_4048_s_4_2.jpg",
                                                        "Spain",
                                                        "Cubism",
                                                        "One of the most influential artists of the 20th century, he is known for co-founding the Cubist movement, the invention of constructed sculpture, the co-invention of collage, and for the wide variety of styles that he helped develop and explore. Picasso's work is often categorized into periods. While the names of many of his later periods are debated, the most commonly accepted periods in his work are the Blue Period, the Rose Period, the African-influenced Period, Analytic Cubism, and Synthetic Cubism, also referred to as the Crystal period",
                                                        "Pablo Diego José Francisco de Paula Juan Nepomuceno Crispín Crispiniano María Remedios de la Santísima Trinidad Ruiz Picasso",
                                                        "04-08-1973",
                                                        "10-25-1881",
                                                        "France",
                                                        Arrays.asList(
                                                                        new Artwork(
                                                                                        "https://static3.museoreinasofia.es/sites/default/files/styles/foto_horizontal_normal/public/obras/DE00050_0.jpg?itok=pGgIuEEd",
                                                                                        "Guernica",
                                                                                        "Picasso said very little about the painting's meaning, leaving interpretation to viewers, critics, and art historians. Although clear as an emotional response to war's senseless violence",
                                                                                        "1937"),
                                                                        new Artwork(
                                                                                        "https://www.artic.edu/iiif/2/ddacae05-9279-51b5-e9ab-00024ae01e27/full/843,/0/default.jpg",
                                                                                        "The Old Guitarist",
                                                                                        "The painting reﬂects the twenty-two-year-old Picasso's personal struggle and sympathy for the plight of the downtrodden",
                                                                                        "1904"),
                                                                        new Artwork(
                                                                                        "https://www.moma.org/media/W1siZiIsIjQzODQ1MiJdLFsicCIsImNvbnZlcnQiLCItcXVhbGl0eSA5MCAtcmVzaXplIDIwMDB4MjAwMFx1MDAzZSJdXQ.jpg?sha=c96b77818fd18af4",
                                                                                        "Les Demoiselles D'Avignon",
                                                                                        "It depicts five naked women composed of flat, splintered planes whose faces were inspired by Iberian sculpture and African masks",
                                                                                        "1907"),
                                                                        new Artwork(
                                                                                        "https://collectionapi.metmuseum.org/api/collection/v1/iiif/488221/1009264/restricted",
                                                                                        "Gertrude Stein",
                                                                                        "An portrait of the famous writer and expatriate Gertrude Stein",
                                                                                        "1906"),
                                                                        new Artwork(
                                                                                        "https://upload.wikimedia.org/wikipedia/en/thumb/9/9c/Garçon_à_la_pipe.jpg/800px-Garçon_à_la_pipe.jpg",
                                                                                        "Garçon à la Pipe",
                                                                                        "The painting depicts an boy wearing a headpiece of flowers, holding a pipe, with more flowers appearing in the background",
                                                                                        "1905"))),
                                        new Artist(
                                                        "Dalí",
                                                        "https://i.pinimg.com/originals/3b/48/01/3b4801afde02f76f9b6a9648dbdf6b3f.jpg",
                                                        "Spain",
                                                        "null",
                                                        "Salvador Domingo Dalí was a Spanish renowned for his technical skill, precise draftsmanship, and the striking and bizarre images in his work. Dalí received his formal education in fine arts in Madrid. Influenced by Impressionism and the Renaissance masters from a young age he became increasingly attracted to Cubism and avant-garde movements. He moved closer to Surrealism in the late 1920s and joined the Surrealist group in 1929, soon becoming one of its leading exponents. His best-known work, The Persistence of Memory, was completed in August 1931, and is one of the most famous Surrealist paintings. based on his interest in classicism, mysticism, and recent scientific developments. Dalí's artistic repertoire included painting, graphic arts, film, sculpture, design and photography, at times in collaboration with other artists. He also wrote fiction, poetry, autobiography, essays and criticism. Major themes in his work include dreams, the subconscious, sexuality, religion, science and his closest personal relationships.",
                                                        "Salvador Domingo Felipe Jacinto Dalí i Domènech",
                                                        "01-23-1989",
                                                        "05-11-1904",
                                                        "Spain",
                                                        Arrays.asList(
                                                                        new Artwork(
                                                                                        "https://www.moma.org/media/W1siZiIsIjM4NjQ3MCJdLFsicCIsImNvbnZlcnQiLCItcXVhbGl0eSA5MCAtcmVzaXplIDIwMDB4MTQ0MFx1MDAzZSJdXQ.jpg?sha=4c0635a9ee70d63e",
                                                                                        "The Persistence of Memory",
                                                                                        "Hard objects become inexplicably limp in this bleak and infinite dreamscape, while metal attracts ants like rotting flesh; Dalí painted “to systematize confusion and thus to help discredit completely the world of reality”",
                                                                                        "1931"),
                                                                        new Artwork(
                                                                                        "https://www.dalipaintings.com/images/paintings/swans-reflecting-elephants.jpg",
                                                                                        "Swans Reflecting Elephants",
                                                                                        "From Dali's Paranoiac-critical period, painted using oil on canvas, it contains one of Dali's famous double images. The double images were a major part of Dali's “paranoia-critical method,” which he put forward in his 1935 essay “The Conquest of the Irrational”",
                                                                                        "1937"),
                                                                        new Artwork(

                                                                                        "https://www.museothyssen.org/sites/default/files/imagen/obras/1974.46_sueno-causado-vuelo-abeja-alrededor-granada-segundo-antes-despertar.jpg",
                                                                                        "The Dream Caused by the Flight of a Bee",
                                                                                        "Dalí depicts two suspended droplets of water and a pomegranate, a Christian symbol of fertility and resurrection. Above the pomegranate flies a bee, an insect that traditionally symbolizes the Virgin",
                                                                                        "1944"),
                                                                        new Artwork(

                                                                                        "https://1.bp.blogspot.com/-UMQ8AVTX9Ac/Xb8adWhBk9I/AAAAAAAACHQ/5WW5MZBWIdYYxEi2dxdl7EyKPpK_w--LwCLcBGAsYHQ/s1600/small-the-burning-giraffe-salvador-dali-s-paintings-collection-original-imaf32ve9urgcsw2.jpg",
                                                                                        "The Burning Giraffe",
                                                                                        "Dali painted Burning Giraffe before his exile in the United States which was from 1940 to 1948. This painting shows his personal struggle with the battle in his home country",
                                                                                        "1937"),
                                                                        new Artwork(

                                                                                        "https://arthistoryproject.com/site/assets/files/20336/salvador_dali-soft_construction_with_boiled_beans-1936-trivium-art-history.jpg",
                                                                                        "Soft Construction with Boiled Beans",
                                                                                        "This painting expresses the destruction during the Spanish Civil War. The monstrous creature in this painting is self-destructive just as a Civil War is",
                                                                                        "1936"))),
                                        new Artist(
                                                        "Vermeer",
                                                        "https://upload.wikimedia.org/wikipedia/commons/4/46/Cropped_version_of_Jan_Vermeer_van_Delft_002.jpg",
                                                        "Netherlands",
                                                        "Baroque",
                                                        null,
                                                        "Johannes Vermeer",
                                                        "15-12-1675",
                                                        "31-10-1632",
                                                        "Netherlands",
                                                        Arrays.asList(
                                                                        new Artwork(
                                                                                        "https://upload.wikimedia.org/wikipedia/commons/thumb/0/0f/1665_Girl_with_a_Pearl_Earring.jpg/865px-1665_Girl_with_a_Pearl_Earring.jpg",
                                                                                        "Girl with a Pearl Earring",
                                                                                        "It depicts a European girl wearing an exotic dress, an oriental turban, and what appears to be a very large pearl as an earring",
                                                                                        "1665"),
                                                                        new Artwork(

                                                                                        "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e4/Johannes_Vermeer_-_The_Astronomer_-_1668.jpg/1803px-Johannes_Vermeer_-_The_Astronomer_-_1668.jpg",
                                                                                        "The Astronomer",
                                                                                        "The astronomer in question is looking at a globe of the heavens, but a number of objects in the room point to Vermeer's focus on religion as well",
                                                                                        "1668"),
                                                                        new Artwork(

                                                                                        "https://images.fineartamerica.com/images/artworkimages/mediumlarge/3/milkmaid-1660-johannes-vermeer.jpg",
                                                                                        "The Milkmaid",
                                                                                        "The painting shows a milkmaid, a woman who milks cows and makes dairy products like butter and cheese, in a plain room carefully pouring milk into a squat earthenware container on a table",
                                                                                        "1661"),
                                                                        new Artwork(

                                                                                        "https://www.everypainterpaintshimself.com/article_images_new/The_Love_Letter.c1669-70.oilcan.Rijksmuseum_copy.jpg",
                                                                                        "The Love Letter",
                                                                                        "The Love Letter (Dutch: De liefdesbrief) is a 17th-century genre painting by Jan Vermeer. The painting shows a servant maid commenting to her mistress on a letter the woman holds",
                                                                                        "1670"),
                                                                        new Artwork(

                                                                                        "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a2/Vermeer-view-of-delft.jpg/1200px-Vermeer-view-of-delft.jpg",
                                                                                        "View of Delft",
                                                                                        "The landscape was painted from an elevated position to the southeast of Delft, possibly the upper floor of a house on the quayside across the river Schie",
                                                                                        "1663"))),
                                        new Artist(
                                                        "Paul Rubens",
                                                        "https://upload.wikimedia.org/wikipedia/commons/a/a0/Peter_Paul_Rubens_-_Self-Portrait_-_WGA20380.jpg",
                                                        "Germany",
                                                        "Baroque",
                                                        null,
                                                        "Peter Paul Rubens",
                                                        "05-30-1640",
                                                        "06-28-1577",
                                                        "Belgium",
                                                        Arrays.asList(
                                                                        new Artwork(
                                                                                        "https://upload.wikimedia.org/wikipedia/commons/thumb/c/cf/Rubens_-_Massacre_of_the_Innocents_-_Art_Gallery_of_Ontario_2.jpg/1200px-Rubens_-_Massacre_of_the_Innocents_-_Art_Gallery_of_Ontario_2.jpg",
                                                                                        "The Massacre of the Innocents",
                                                                                        "Depicts the biblical tale of Roman soldiers executing male newborns in Bethlehem on the orders of King Herod",
                                                                                        "1610"),
                                                                        new Artwork(

                                                                                        "https://upload.wikimedia.org/wikipedia/commons/d/d2/Descent_from_the_Cross_%28Rubens%29_July_2015-1a.jpg",
                                                                                        "The Descent from the Cross",
                                                                                        "Depicts Christ's lifeless body being taken down from the cross by a group of people, among them the Virgin Mary, John the Apostle cloaked in red and Mary Magdalene, described by the cathedral as “a paragon of Baroque art”",
                                                                                        "1612"),
                                                                        new Artwork(

                                                                                        "https://upload.wikimedia.org/wikipedia/commons/thumb/3/32/Peter_Paul_Rubens_-_The_Judgment_of_Paris_-_WGA20307.jpg/2560px-Peter_Paul_Rubens_-_The_Judgment_of_Paris_-_WGA20307.jpg",
                                                                                        "The Judgement of Paris",
                                                                                        "Depicts the mythic Roman tale of the same name in which Paris was forced to judge the most beautiful of three goddesses — Venus, Minerva and Juno — in events that ignited the Trojan War",
                                                                                        "1636"),
                                                                        new Artwork(
                                                                                        "https://upload.wikimedia.org/wikipedia/commons/8/84/Peter_Paul_Rubens_083.jpg",
                                                                                        "The Hippopotamus and Crocodile Hunt",
                                                                                        "Commissioned by Maximilian I, Elector of Bavaria to adorn his summer residence, the Schleissheim Palace — is just one of these hunting pieces and today resides at Munich's Alte Pinokothek.",
                                                                                        "1616"),
                                                                        new Artwork(

                                                                                        "https://upload.wikimedia.org/wikipedia/commons/thumb/9/9a/Rubens_-_Prometheus_Bound.jpg/1200px-Rubens_-_Prometheus_Bound.jpg",
                                                                                        "Prometheus Bound",
                                                                                        "With hooked beak, a monstrous vulture digs about in the liver of Prometheus, who is given no peace from his torments as ever and again the savage bird draws near his self-renewing breast and attacks it punishingly",
                                                                                        "1612"))),
                                        new Artist(
                                                        "Gustave Doré",
                                                        null,
                                                        "France",
                                                        "impressionism",
                                                        null,
                                                        "Paul-Gustave Doré",
                                                        "01-23-1883",
                                                        "01-06-1832",
                                                        "France",
                                                        Arrays.asList(
                                                                        new Artwork(
                                                                                        "https://upload.wikimedia.org/wikipedia/commons/thumb/e/ed/Gustave_Dore_-_La_Siesta%2C_Memory_of_Spain_-_Google_Art_Project.jpg/1200px-Gustave_Dore_-_La_Siesta%2C_Memory_of_Spain_-_Google_Art_Project.jpg",
                                                                                        "La Siesta",
                                                                                        "----",
                                                                                        "1868"),
                                                                        new Artwork(

                                                                                        "https://i.pinimg.com/originals/22/3a/05/223a05e867dc521bc250a8a4d2f897d0.jpg",
                                                                                        "The Enigma",
                                                                                        "The Enigma features a scene of carnage, as a city burns and bodies are strewn right across the composition. This artwork followed on soon after France's defeat to Prussia a year earlier",
                                                                                        "1871"),
                                                                        new Artwork(

                                                                                        "https://upload.wikimedia.org/wikipedia/commons/b/b7/Gustave_Dor%C3%A9_-_Dante_et_Virgile_dans_le_neuvi%C3%A8me_cercle_de_l%27Enfer.jpg",
                                                                                        "Dante and Virgil in the Ninth Circle of Hell",
                                                                                        "In Dante's 'Inferno,' Dante himself is led through the nine circles of hell by the ancient poet Virgil, finally arriving at the ninth circle where those who hate the idea of love reside, including Satan himself. Since love brings warmth and comfort. They claw and bite at one another and writhe in pain",
                                                                                        "1861"),
                                                                        new Artwork(

                                                                                        "https://upload.wikimedia.org/wikipedia/commons/a/ae/Les_Oceanides_Les_Naiades_de_la_mer.jpg",
                                                                                        "Oceanides",
                                                                                        "Based on the ancient Greek tragedy Prometheus Bound, the painting depicts a group of nymphs at a rock in the ocean. In the background, the Titan Prometheus is chained to a cliff, a punishment given to him by Zeus after he stole fire from the gods and gave it to mankind",
                                                                                        "1869"),
                                                                        new Artwork(

                                                                                        "https://upload.wikimedia.org/wikipedia/commons/thumb/b/b1/Gustave_Dor%C3%A9_-_Alpine_Scene_-_1967.588_-_Art_Institute_of_Chicago.jpg/1200px-Gustave_Dor%C3%A9_-_Alpine_Scene_-_1967.588_-_Art_Institute_of_Chicago.jpg",
                                                                                        "Alpine Scene",
                                                                                        "----",
                                                                                        "1865"))),
                                        new Artist(
                                                        "Caravaggio",
                                                        null,
                                                        "Italy",
                                                        "Baroque",
                                                        null,
                                                        "Michelangelo \"Caravaggio\" Merisi",
                                                        "07-18-1610",
                                                        "09-29-1571",
                                                        "Italy",
                                                        Arrays.asList(
                                                                        new Artwork(
                                                                                        "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e5/The_Incredulity_of_Saint_Thomas-Caravaggio_%281601-2%29.jpg/1280px-The_Incredulity_of_Saint_Thomas-Caravaggio_%281601-2%29.jpg",
                                                                                        "The Incredulity of Saint Thomas",
                                                                                        "One of the apostles of Christ, Thomas doubted his ressurection, saying he would not believe it until he could place his finger where the nails had pierced his crucified body",
                                                                                        "1602"),
                                                                        new Artwork(
                                                                                        "https://upload.wikimedia.org/wikipedia/commons/b/b2/La_decapitaci%C3%B3n_de_San_Juan_Bautista%2C_por_Caravaggio.jpg",
                                                                                        "The Beheading of Saint John the Baptist",
                                                                                        "The oil depicts the execution of John the Baptist and is the only work that Caravaggio ever signed. His signature, located in the blood that spills from John's throat, was discovered during restoration of the work",
                                                                                        "1608"),
                                                                        new Artwork(

                                                                                        "https://upload.wikimedia.org/wikipedia/commons/thumb/4/48/The_Calling_of_Saint_Matthew-Caravaggo_%281599-1600%29.jpg/1200px-The_Calling_of_Saint_Matthew-Caravaggo_%281599-1600%29.jpg",
                                                                                        "The Calling of Saint Matthew",
                                                                                        "The painting shows the very moment in which Jesus inspired Matthew to follow him. Standing alongside Saint Peter, Jesus points at Matthew, who is sitting at a table with four other men",
                                                                                        "1600"),
                                                                        new Artwork(

                                                                                        "https://upload.wikimedia.org/wikipedia/commons/thumb/2/29/Narcissus-Caravaggio_%281594-96%29_edited.jpg/1200px-Narcissus-Caravaggio_%281594-96%29_edited.jpg",
                                                                                        "David with the Head of Goliath",
                                                                                        "David is depicted not celebrating his victory over the giant, but rather lost in thought, perhaps pondering his curious biblical connection and bond with his adversary",
                                                                                        "1610"),
                                                                        new Artwork(

                                                                                        "http://totallyhistory.com/wp-content/uploads/2012/09/Michelangelo_Caravaggio.jpg",
                                                                                        "Narcissus",
                                                                                        "Caravaggio painted an adolescent page wearing an elegant brocade doublet, leaning with both hands over the water, as he gazes at this own distorted reflection. The figure of Narcissus is locked in a circle with his reflection, surrounded by darkness, so that the only reality is inside this self-regarding loop",
                                                                                        "1599"))),
                                        new Artist(
                                                        "Monet",
                                                        "https://upload.wikimedia.org/wikipedia/commons/thumb/1/1a/Autoportret_Claude_Monet.jpg/1623px-Autoportret_Claude_Monet.jpg",
                                                        "France",
                                                        "Baroque",
                                                        null,
                                                        "Oscar-Claude Monet",
                                                        "12-05-1926",
                                                        "11-14-1840",
                                                        "France",
                                                        Arrays.asList(
                                                                        new Artwork(
                                                                                        "https://media.nga.gov/iiif/99758d9d-c10b-4d02-a198-7e49afb1f3a6/full/!588,600/0/default.jpg",
                                                                                        "Woman with Parasol",
                                                                                        "In the painting, Mrs Monet's veil is blown by the wind, as is her billowing white dress. Monet's seven-year-old son, is placed further away",
                                                                                        "1875"),
                                                                        new Artwork(
                                                                                        "https://upload.wikimedia.org/wikipedia/commons/8/80/La_Grenouill%C3%A8re_MET_DT833.jpg",
                                                                                        "La Grenouillère",
                                                                                        "La Grenouillère was a popular resort with a spa, boating facilities and a floating café. Young Renoir and Monet went together on a painting trip to La Grenouillère, the two artists set up their easels outdoors and painted en-plein air",
                                                                                        "1869"),
                                                                        new Artwork(
                                                                                        "https://images.prismic.io/barnebys/37d91e82-c30e-4850-b47d-8d22b4924249_Claude+Monet+%281840-1926%29_+Le+Bassin+aux+nymph%C3%A9as%2C+1917-1919%2C+huile+sur+toile%2C+100+x+200+cm.+Photo+%C2%A9+Sotheby%27s.jpg?auto=compress,format",
                                                                                        "Nymphéas",
                                                                                        "Monet painted a series of waterlilies, they are scattered all over the world and are recognized as his most famous paintings",
                                                                                        "1926"),
                                                                        new Artwork(
                                                                                        "https://upload.wikimedia.org/wikipedia/commons/6/61/Claude_Monet_-_The_Saint-Lazare_Station_-_Google_Art_Project.jpg",
                                                                                        "The Saint-Lazare Station",
                                                                                        "Trains were now a new form of public transport. For Monet, this train station represented modern progress and the massive industrialization that was springing up all over the country",
                                                                                        "1877"),
                                                                        new Artwork(
                                                                                        "https://upload.wikimedia.org/wikipedia/commons/6/68/Claude_Monet_- _Stacks_of_Wheat_%28End_of_Summer%29_-_1985.1103_-_Art_Institute_of_Chicago.jpg",
                                                                                        "Haystack at the End of Summer",
                                                                                        "In 1890 and 1891, Claude Monet painted another series of twenty-five canvases depicting Haystacks. These paintings capture haystacks after the harvest season from the surrounding farming fields in Giverny",
                                                                                        "1891"))),
                                        new Artist(
                                                        "Munch",
                                                        "https://upload.wikimedia.org/wikipedia/commons/5/5e/Edvard_Munch_-_Self-Portrait_-_Google_Art_Project_%28533070%29.jpg",
                                                        "Norway",
                                                        "Expressionism",
                                                        null,
                                                        "Edvard Daniel Jon Hans Einar Erling Munch",
                                                        null,
                                                        null,
                                                        null,
                                                        Arrays.asList(
                                                                        new Artwork(
                                                                                        "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c5/Edvard_Munch%2C_1893%2C_The_Scream%2C_oil%2C_tempera_and_pastel_on_cardboard%2C_91_x_73_cm%2C_National_Gallery_of_Norway.jpg/1200px-Edvard_Munch%2C_1893%2C_The_Scream%2C_oil%2C_tempera_and_pastel_on_cardboard%2C_91_x_73_cm%2C_National_Gallery_of_Norway.jpg",
                                                                                        "The Scream",
                                                                                        "Munch recalled that he had been out for a walk at sunset when suddenly the setting sun's light turned the clouds “a blood red”. He sensed an “infinite scream passing through nature”",
                                                                                        "1893"),
                                                                        new Artwork(
                                                                                        "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a2/Edvard_Munch_-_Vampire_%281895%29_-_Google_Art_Project.jpg/1200px-Edvard_Munch_-_Vampire_%281895%29_-_Google_Art_Project.jpg",
                                                                                        "Love and Pain",
                                                                                        "The painting depicts a man and woman embracing, with the woman appearing to be either kissing or biting the man on his neck",
                                                                                        "1893"),
                                                                        new Artwork(
                                                                                        "https://images.fineartamerica.com/images/artworkimages/mediumlarge/3/3-puberty-edvard-munch.jpg",
                                                                                        "Puberty",
                                                                                        "A naked young girl with loose hair is sitting on the edge of a bed, hiding her crotch with her arms. She stares at us with wide-open eyes",
                                                                                        "1894"),
                                                                        new Artwork(

                                                                                        "https://upload.wikimedia.org/wikipedia/commons/e/ef/Edvard_Munch_-_The_Kiss_-_Google_Art_Project.jpg",
                                                                                        "The Kiss",
                                                                                        "Munch never married. The dark ambiance of The Kiss is representative of Munch's ambivalence regarding romance. It's virtually impossible to separate the two figures, particularly where their faces meet and become one in the painting",
                                                                                        "1987"),
                                                                        new Artwork(

                                                                                        "https://upload.wikimedia.org/wikipedia/commons/thumb/0/08/Edvard_Munch_-_Death_in_the_Sickroom_-_Google_Art_Project.jpg/1200px-Edvard_Munch_-_Death_in_the_Sickroom_-_Google_Art_Project.jpg",
                                                                                        "Death in the Sickroom",
                                                                                        "Death in the Sickroom from 1893 goes back to the memory of sister Sophie's death. She died of tuberculosis in 1877. The motif is one of a number of Munch's portrayals of sickness, death and sorrow in the family",
                                                                                        "1893")))));
}
