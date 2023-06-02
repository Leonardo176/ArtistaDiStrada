# ArtistaDiStrada
Exercize 32 of the threads' workbook.

## Synchronization's method

Two semaphores were used to synchronize threads:
- 1 counting to make people wait in the 4 seats available (therefore the semaphore was initialized with the number 4);
- 1 mutex to make the artist only draw one person at a time.

For managing starvation, the method ```bool tryLock()``` was created in order to see if a thread can lock the semaphore, if it can't it returns false without blocking the thread.

In this way, it is possible to see how many time has passed and if too much time has been wasted, the person (thread) gives up.