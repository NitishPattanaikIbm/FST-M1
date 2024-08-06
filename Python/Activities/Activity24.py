import pytest

@pytest.fixture
def wallet():
    """Fixture that initializes the wallet amount to 0."""
    return {'amount': 0}

@pytest.mark.parametrize("earned, spent, expected", [
    (30, 10, 20),
    (20, 2, 18)
])
def test_wallet_transactions(wallet, earned, spent, expected):
    """Test that checks wallet balance after transactions."""
    # Add earned money to the wallet
    wallet['amount'] += earned
    
    # Spend some money from the wallet
    wallet['amount'] -= spent
    
    # Assert the remaining amount is as expected
    assert wallet['amount'] == expected, f"Expected {expected}, but got {wallet['amount']}"

if __name__ == "__main__":
    pytest.main()
