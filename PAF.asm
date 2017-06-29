extern _printf
extern _scanf
section .data
	intMessage: db "%i",0
	stringMessage: db "%s",0
	intMessageL: db "%i",10,0
	stringMessageL: db "%s",10,0
result0: db "%d",0
input: times 4 db 0
result1: db "%d",0
section .bss

section .text
global start

start:
	push ebp
	mov ebp, esp
	sub esp,32
	mov ecx,0

	mov dword [ebp-4], ecx



	push .start.invite
	push dword stringMessageL
	call _printf
	add esp,8
	mov edx,0

	mov dword [ebp-20], edx
.L0:
	push dword input
	push dword result0
	call _scanf
	add esp,8
	mov ebx,[input]
	mov [ebp-20], ebx
	mov eax,0

	cmp [ebp-20], eax
	jg .L2
	mov ecx,1
	jmp .L3
.L2:
	mov ecx,0
.L3:
	mov edx,3

	cmp [ebp-20], edx
	jle .L4
	mov ebx,1
	jmp .L5
.L4:
	mov ebx,0
.L5:
	mov eax,ecx
	or eax, ebx
	cmp eax,1
	jne .L6
	push .start.error
	push dword stringMessageL
	call _printf
	add esp,8
.L6:
	jmp .L1
.L1:
	mov ecx,0

	cmp [ebp-20], ecx
	jg .L7
	mov edx,1
	jmp .L8
.L7:
	mov edx,0
.L8:
	mov ebx,3

	cmp [ebp-20], ebx
	jle .L9
	mov eax,1
	jmp .L10
.L9:
	mov eax,0
.L10:
	mov ecx,edx
	or ecx, eax
	cmp ecx,1
	je .L0
	mov edx,0

	mov dword [ebp-24], edx
	mov ebx,0

	mov dword [ebp-28], ebx
.L11:
	mov ecx, [ebp-28]
	cmp [ebp-24], ecx
	jne .L12
	mov eax, [ebp-20]
	call printGame
	mov edx,4

	mov dword [ebp-32], edx
	mov ebx,[ebp-4]
	xor edx,edx
	mov eax,ebx
	mov ebx,2
	idiv ebx
	mov ebx,edx
	push ebx
	push dword .start.string1
	call _printf
	add esp,8
	push .start.enlever
	push dword stringMessageL
	call _printf
	add esp,8
.L13:
	push dword input
	push dword result1
	call _scanf
	add esp,8
	mov eax,[input]
	mov [ebp-32], eax
	mov ecx,0

	cmp [ebp-32], ecx
	jg .L15
	mov edx,1
	jmp .L16
.L15:
	mov edx,0
.L16:
	mov ebx,3

	cmp [ebp-32], ebx
	jl .L17
	mov eax,1
	jmp .L18
.L17:
	mov eax,0
.L18:
	mov ecx,edx
	and ecx, eax
	cmp ecx,1
	jne .L19
	push .start.error
	push dword stringMessageL
	call _printf
	add esp,8
.L19:
	jmp .L14
.L14:
	mov eax, [ebp-32]
	mov ebx, [ebp-20]
	call valide
	mov [esp+32],eax

	mov edx,0

	cmp [esp+32], edx
	je .L13
	mov eax,[ebp-20]
	sub eax,[ebp-32]
	mov dword [ebp-20], eax
	mov ecx,1

	cmp [ebp-20], ecx
	jne .L20
	mov ebx,[ebp-4]
	xor edx,edx
	mov eax,ebx
	mov ebx,2
	idiv ebx
	mov ebx,edx

	mov eax,0

	cmp ebx, eax
	jne .L21
	mov ebx,1

	mov dword [ebp-24], ebx
	jmp .L22
.L21:
	mov eax,1

	mov dword [ebp-28], eax
.L22:
.L20:
	mov ecx,[ebp-4]
	add ecx,1
	mov dword [ebp-4], ecx
	jmp .L11
.L12:
	mov eax, [ebp-24]
	mov ebx, [ebp-28]
	call printFin
	nop
	add esp,32
	pop ebp
	mov eax,1
	mov ebx,0
	int 80h
.start.string1: db "Au tour du joueur %d!",10,0
.start.invite: db "Entrez un nombre de batons initial :",0
.start.error: db "Il faut saisir un nombre entre 1 et 3!",0
.start.enlever: db "Entrez un nombre de batons à enlever (entre 1 et 3) :",0

printGame:
	push ebp
	mov ebp, esp
	sub esp,16
	mov [ebp-4], eax

	push .printGame.s
	push dword stringMessageL
	call _printf
	add esp,8

	mov edx,0

	mov dword [ebp-16], edx
.L23:
	mov ebx,[ebp-4]
	sub ebx,1
	cmp [ebp-16], ebx
	jge .L24
	push .printGame.symbole
	push dword stringMessage
	call _printf
	add esp,8
	mov ecx,[ebp-16]
	add ecx,1
	mov dword [ebp-16], ecx
	jmp .L23
.L24:
	push .printGame.symbole
	push dword stringMessageL
	call _printf
	add esp,8
	nop
	add esp,16
	pop ebp
	ret
.printGame.s: db "L'état du jeu est : ",0
.printGame.symbole: db "|",0

valide:
	push ebp
	mov ebp, esp
	sub esp,16
	mov [ebp-4], eax
	mov [ebp-8], ebx
	mov edx,1

	mov dword [ebp-12], edx
	mov ebx,0

	cmp [ebp-4], ebx
	jge .L25
	mov eax,1
	jmp .L26
.L25:
	mov eax,0
.L26:
	mov ecx,3

	cmp [ebp-4], ecx
	jle .L27
	mov edx,1
	jmp .L28
.L27:
	mov edx,0
.L28:
	mov ebx,eax
	or ebx, edx
	mov ecx, [ebp-8]
	cmp [ebp-4], ecx
	jle .L29
	mov eax,1
	jmp .L30
.L29:
	mov eax,0
.L30:
	mov edx,ebx
	or edx, eax
	cmp edx,1
	jne .L31
	mov ebx,0

	mov dword [ebp-12], ebx
.L31:
	mov eax,[ebp-12]
	add esp,16
	pop ebp
	ret

printFin:
	push ebp
	mov ebp, esp
	sub esp,16
	mov [ebp-4], eax
	mov [ebp-8], ebx


	mov eax,1

	cmp [ebp-4], eax
	jne .L32
	push .printFin.gagne1
	push dword stringMessageL
	call _printf
	add esp,8
	jmp .L33
.L32:
	mov edx,1

	cmp [ebp-8], edx
	jne .L34
	push .printFin.gagne2
	push dword stringMessageL
	call _printf
	add esp,8
.L34:
.L33:
	nop
	add esp,16
	pop ebp
	ret
.printFin.gagne2: db "Félicitation, le joueur 2 gagne !",0
.printFin.gagne1: db "Félicitation, le joueur 1 gagne !",0
