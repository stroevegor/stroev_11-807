import java.util.*;
import java.util.Scanner;



public class Kingdom {
    public static void main(String[] args) {
        System.out.println("     Добро Пожаловать в Карточное Королевство!     ");
        System.out.println();
        System.out.println();
        System.out.println("Narrator:  Рад видеть Вас в нашем королевстве, Джо! Здесь каждый может добиться небывалых высот, но помните, что здесь Вы можете, как и получить всё, что вы хотите, так и потерять. Каждый день вам придется делать выбор и от этого выбора будет зависеть абсолютно всё. Будьте аккуратнее, ведь каждый член королевства желает достичь своих целей. Король, Туз (тайный советник Короля), Дама и Валет, каждый играет сам за себя, у каждого есть какой-то предмет, который может пригодиться вам в будущем для достижения целей. Вы можете стать новым Королем, лишить Валета титула, завладеть сердцем Дамы, раскрыть секреты Туза или просто потерять всё и раствориться во времени. Удачи, пусть Джо станет Джокером!\n" +
                "\n" +
                "Narrator:   \n" +
                "\n" +
                "       Дама (Princess) молодая принцесса, мечтающая найти своего принца. Завладеть её сердцем не так просто. Дама с детства мечтала, чтобы за её сердце боролись на рыцарских поединках, также она без ума от волшебной  *Розы, которая хранится в тайном саду, про который знает только Туз. Однажды еще маленькая принцесса, случайно нашла *Секретные документы, обнародования которых очень боится Туз.\n" +
                "\n" +
                "     Король (King)  очень боится потерять своё королевство, но единственное от чего он может погибнуть это *Королевский яд, который охраняет его верный слуга Валет. Туз всегда помогал ему в управлении королевством и Королю кажется, что Туз неравнодушен к престолу. Король считает, что наследника престола нет, ведь ни один член королевства не достоин её сердца, но если по-настоящему проявить себя перед Королем, то он может поменять своё решение. У Короля есть *Меч, который может помочь выиграть рыцарский поединок.\n" +
                "\n" +
                "Туз (Ace)  всегда считал Короля слабым правителем, он готов пойти на всё, лишь бы завладеть заветным престолом. Он надеется, что *Секретные данные о его хищениях у народа никогда не придадут огласки, поэтому боится Дамы. В своём тайном саду он выращивает волшебную *Розу, но считает её малоэффективной для борьбы за сердце Дамы.\n" +
                "\n" +
                "Валет  (Valet)  верный слуга Короля, сын покойного близкого друга Короля, очень беден, но имеет влиятельный титул. Он охраняет  *Королевский яд, но ради сердца принцессы готов на многое. Мечтает проявить себя в рыцарском бою и жениться на Даме. Также, он знает о существовании *Розы в одном из тайных садов королевства.");
        Scanner sc = new Scanner(System.in);
        System.out.println(" Для начала игры нажмите 1");
        int a = sc.nextInt();
        if (a == 1) {
            System.out.println("1  Princess:  Здравствуй, Джо! У меня есть  *Секретные материалы, думаю они могут тебе пригодиться, но не забывай про меня, я очень хочу найти своего принца, который подарит мне волшебную розу и победит в рыцарском поединке.\n");
            System.out.println("2  Ace: Здравствуй,  Джо! У меня есть *Роза, которую я очень долго выращивал, но в этой жизни ничто не бывает просто так. Если возьмешь цветок, то ты должен договориться с принцессой, чтобы она не обнародовала материалы и еще ты заметил, что казна королевства пустеет, а люди голодают? Уверяю тебя, что так и есть. Помоги мне занять престол, а я в долгу не останусь.\n");
            System.out.println("3 Valet: Здравствуй,  Джо! У меня есть  *Королевский яд, я могу тебе его отдать, но я день и ночь думаю о принцессе, помоги мне завоевать её сердце, я хочу быть с ней до конца своих лет. Ace: Здравствуй,  Джо! У меня есть *Роза, которую я очень долго выращивал, но в этой жизни ничто не бывает просто так. Если возьмешь цветок, то ты должен договориться с принцессой, чтобы она не обнародовала материалы и еще ты заметил, что казна королевства пустеет, а люди голодают? Уверяю тебя, что так и есть. Помоги мне занять престол, а я в долгу не останусь.\n");
            System.out.println("4  King:   Здравствуй,  Джо! У меня есть  *Меч, который точно принесет тебе победу в рыцарском поединке, но меня очень беспокоит мой тайный советник.  Нужно раскрыть его секреты и не доверяй Валету, у него есть яд, который способен погубить меня. Ты же хочешь стабильности, верно? \n");
            System.out.println("Ваш выбор:");
            int b = sc.nextInt();
            if (b == 1) {
                System.out.println("У вас есть *Секретные материалы. Как использовать?");
                System.out.println("1 Доложить Королю на Туза, получить *Меч");
                System.out.println("2 Отдать Валету в обмен на  *Яд");
                System.out.println("3 Отдать материал Тузу в обмен на  *Розу");
                int c = sc.nextInt();
                if (c == 1) {
                    System.out.println("Материалы обнародованы, Туз казнён. Вас повесили на центральной площади вместе с Тузом, ведь никто не любит доносчиков. ");

                } else if (c == 2) {
                    System.out.println("Яд у Вас, Валет обнародовал материалы, Туз казнён. Что делать с ядом?");
                    System.out.println("1  Отравить Короля");
                    System.out.println("2 Отдать Королю в обмен на *Меч");
                    int d = sc.nextInt();
                    if (d == 1) {
                        System.out.println("Король мёртв, Дама никогда не сможет вас простить, её сердце отныне принадлежит Валету, Вы новый Король, но сердцечко йокает, правда?");
                    } else if (d == 2) {
                        System.out.println("Вы побеждаете Валета на рыцарском поединке, сердце Дамы принадлежит Вам, на престоле всё тот же Король, похоже вы так и никогда не сможете примерить корону");
                    }


                } else if (c == 3) {
                    System.out.println("Материал у Туза, теперь ему не о чем беспокоиться. *Роза у вас, что дальше?");
                    System.out.println("1 Обменять на  *Яд у Валета");
                    System.out.println("2 Подарить *Розу Даме");
                    int e = sc.nextInt();
                    if (e == 1) {
                        System.out.println("У вас есть  *Яд, что делать дальше?");
                        System.out.println("1 Отдать Королю и получить *Меч");
                        System.out.println("2 Отдать Тузу");
                        int f = sc.nextInt();
                        if (f == 1) {
                            System.out.println("Вы выиграли рыцарский поединок с помощью меча, Вы завоевали сердце Дамы, Туз всё также обворовывает народ, а Король сидит на престоле. Сердце выше самореализации, похвально, но какой из вас Джокер?");

                        } else if (f == 2) {
                            System.out.println("Вас мучает совесть, предупредить Короля о покушении в обмен на  *Меч?");
                            System.out.println("1 Предупредить");
                            System.out.println("2 Не предупреждать");
                            int g = sc.nextInt();
                            if (g == 1) {
                                System.out.println(" С помощью  *Меча Вы выиграли рыцарский поединок, сердце Дамы ваше, Король казнит Туза на центральной площади, но беднягу хватает сердечный приступ и он умирает. Теперь Вы ещё и Король и настоящий Джокер! Победа!");

                            } else if (g == 2) {
                                System.out.println(" Король умирает, Туз почти достиг своей цели, но Валет убивает его и становится Королем. А вы... Ах, да, вы лузер");
                            }
                        }


                    } else if (e == 2) {
                        System.out.println("Цветочки оставьте на 1 сентября, Дам в наше время цветами не удивишь, Дама с Валетом, Король на престоле, Туз всё также грабит народ, а про вас просто все забыли");

                    }

                }


            }

            else if (b == 2) {
                System.out.println("Вы взяли *Розу, что дальше?");
                System.out.println("1 Подарить *Розу Даме");
                System.out.println("2 Поменять цветок на  *Яд у Валета");
                int ba = sc.nextInt();
                if (ba == 1) {
                    System.out.println("Цветочки оставьте на 1 сентября, Дам в наше время цветами не удивишь, Дама с Валетом, Король на престоле, Туз всё также грабит народ, а про вас просто все забыли");

                } else if (ba == 2) {
                    System.out.println(" *Яд у Вас, что делать дальше?");
                    System.out.println("1 Отравить Короля");
                    System.out.println("2 Отдать *Яд Тузу");
                    System.out.println("3 Отдать Королю  в обмен на  *Меч");
                    int bb = sc.nextInt();
                    if (bb == 1) {
                        System.out.println("Король мёртв, Дама никогда не сможет вас простить, её сердце отныне принадлежит Валету, Вы новый Король, но сердцечко йокает, правда?");
                    } else if (bb == 2) {
                        System.out.println("Туз стал Королём, старый Король мёртв, Дама с Валетом в заточении вместе и навсегда. Вы стали новым тайным советником, но какой из Вас теперь Джокер? Скорее Вы Робин из Бэтмана");
                    } else if (bb == 3) {
                        System.out.println(" Вы победили на рыцарском турнире, сердце Дамы Ваше, она отдала вам *Секретные материалы,  что делать дальше? ");
                        System.out.println("1 Отдать Тузу");
                        System.out.println("2 Отдать Королю");
                        int bc = sc.nextInt();
                        if (bc == 1) {
                            System.out.println("Туз нанимает свиту, чтобы убить Вас и Даму, потому что Вы слишком много знаете. Смерть.");
                        } else if (bc == 2) {
                            System.out.println("Туза казнили на центральной площади, Король женит Вас на своей дочери, но, к сожалению, умирает от сердечного приступа, Вы новый Король, Вы настоящий Джокер! Поздравляю, победа!");
                        }

                    }

                }
            }

            else if (b == 3) {
                    System.out.println("Вы взяли  *Яд, что дальше?");
                    System.out.println("1  Отравить Короля");
                    System.out.println("2  Отдать Тузу в обмен на *Розу");
                    System.out.println("3  Отдать Королю  в обмен на  *Меч");
                    int bd = sc.nextInt();
                    if (bd == 1) {
                        System.out.println("Король мёртв, Дама никогда не сможет вас простить, её сердце отныне принадлежит Валету, Вы новый Король, но сердцечко йокает, правда?");
                    }
                    else if (bd == 2) {
                        System.out.println("Король умирает, Туз почти достиг своей цели, но Валет убивает его ради Дамы и становится Королем.  А вы... Ах, да, вы лузер");
                    }

                    else if (bd == 3) {
                        System.out.println("У Вас есть *Меч, что дальше?");
                        System.out.println("1 Отдать  *Меч Тузу в обмен на  *Розу");
                        System.out.println("2 Вызвать Валета на рыцарский бой");
                        int be = sc.nextInt();
                        if (be == 1){
                            System.out.println("Вы дарите *Розу Даме, Туз побеждает Валета в рыцарском бою и женится на Даме. А вы... Ах, да, вы лузер");
                        }
                        else if (be == 2) {
                            System.out.println("Победа над Валетом, Туз подарил *Розу Даме, теперь он наследник престола. А вы... Ах, да, вы лузер");
                        }
                    }


                }
                else if (b == 4) {
                    System.out.println("Вы взяли  *Меч, что дальше?");
                    System.out.println("1 Вызвать на поединок Валета");
                    System.out.println("2 Отдать *Меч Тузу в обмен на *Розу");
                     int bf = sc.nextInt();
                     if (bf == 1 ) {
                         System.out.println("Вы победили в рыцарском поединке, теперь *Яд у Вас, что дальше?");
                         System.out.println("1 Отравить Короля");
                         System.out.println("2 Отдать *Яд Тузу в обмен на  *Розу");
                         int cc = sc.nextInt();
                         if (cc == 1) {
                             System.out.println("Король мёртв, Дама никогда не сможет вас простить, её сердце отныне принадлежит Валету, Вы новый Король, но сердцечко йокает, правда?");
                         }
                         else if (cc == 2) {
                             System.out.println("Король умирает, Туз новый Король. Туз нанимает свиту, чтобы убить Вас и Даму, потому что Вы слишком много знаете. Смерть.");
                         }

                     }
                      else if (bf == 2) {
                         System.out.println("Вы дарите *Розу Даме, Туз побеждает Валета в рыцарском бою и женится на Даме. А вы... Ах, да, вы лузер");

                     }


                }


            }


        }
    }
