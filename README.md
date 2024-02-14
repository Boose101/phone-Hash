The hashCode function levraged the sha-256 hash to be able to hash each combo of name and number. The Sha-256 hash is one of the most widly known and used hashes.
However due to the constraints on the project I had to convert the final byte[] into an int resulting in a unique verison of the sha-256 hash in which the hash digest is changed. 
First step in the sha-256 hashing process is padding the message so the final length is 448 mod 512. The padding is a '1' then '0' until desired length.
Sha-256 uses a set of eight initial hash values. These inital values are the first 32 bits of the square roots of the first eight primes.
For each 512 bit block, the algo performs a series of operations on 64 smaller blocks of 32 bits. 
The algo uses logical functions and operations (ch, maj, sum0, sum1, sigma0, sigma1) that mix bits.
For each round, the hash computation includes bitwise operations, additions, modulo, and the use of the round constants. The output of each round is fed into the next round as input.
The output of the final round of each block is added to the hash value of the previous block (or the initial hash values for the first block), producing a new hash value.
